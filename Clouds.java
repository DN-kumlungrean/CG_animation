import java.awt.*;

public class Clouds {
    private static final int SKY_BOTTOM_Y = 200; 
  
    private final long startNano = System.nanoTime();

    private static class Band {
        int amplitude;      
        int valleyLift;     
        int tileW;          // wavelength
        double speed;       
        Color colorBase;    
        Color colorOver;    
        int overBoost;      
        double phase;       
        Band(int amplitude,int valleyLift,int tileW,double speed,
             Color cBase, Color cOver,int overBoost,double phase){
            this.amplitude=amplitude; this.valleyLift=valleyLift; this.tileW=tileW;
            this.speed=speed; this.colorBase=cBase; this.colorOver=cOver;
            this.overBoost=overBoost; this.phase=phase;
        }
    }

    private final Band[] bands = new Band[]{
        new Band( 100, 30, 170, 9.0, new Color(240,225,205,150), new Color(255,245,220,190), 3, 0.00),
        new Band(65, 15, 150, 12.0, new Color(240,225,207,140), new Color(255,236,189,180), 4, 0.18),
        new Band(35, 5, 120, 18.0, new Color(233,211,181,140), new Color(219,189,128,190), 2, 0.36), //225,194,154 
    };

    public void draw(Graphics2D g2d, int panelWidth) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        double tSec = (System.nanoTime() - startNano) / 1e9;

        for (Band b : bands) {
            // base strip
            g2d.setColor(b.colorBase);
            fillCloudBandTopDomeChain(g2d, panelWidth, SKY_BOTTOM_Y,
                    b.amplitude, b.valleyLift, b.tileW,
                    tSec * b.speed, b.phase);

            // overlay highlight
            g2d.setColor(b.colorOver);
            fillCloudBandTopDomeChain(g2d, panelWidth, SKY_BOTTOM_Y,
                    Math.max(1, b.amplitude + b.overBoost),
                    Math.max(1, b.valleyLift + Math.max(1, b.overBoost/2)),
                    b.tileW, tSec * (b.speed * 1.05), (b.phase + 0.10) % 1.0);
        }
    }

    private void fillCloudBandTopDomeChain(Graphics2D g2d, int panelWidth, int bottomY,
                                           int amplitude, int valleyLift, int tileW,
                                           double shiftPx, double phase01) {
        // Sanity clamps
        if (valleyLift < 1) valleyLift = 1;
        if (amplitude <= valleyLift) amplitude = valleyLift + 1;
        if (tileW < 8) tileW = 8;

        // Phase & shift wrap
        int phasePix = (int)Math.floor(phase01 * tileW);
        int offset = ((int)Math.floor(shiftPx) + phasePix) % tileW;
        if (offset < 0) offset += tileW;

        // Buffers
        final int samplesPerTile = 12;
        final int maxSegments = (panelWidth + tileW * 2) / tileW + 4;
        final int maxPts = maxSegments * samplesPerTile + 8;
        int[] xs = new int[maxPts];
        int[] ys = new int[maxPts];
        int n = 0;

        int startX = -tileW - offset;
        int endX = panelWidth + tileW;
        int prevx = Integer.MIN_VALUE, prevy = Integer.MIN_VALUE;

        for (int x0 = startX; x0 <= endX; x0 += tileW) {
            int ax = x0;                 int ay = bottomY - valleyLift; // left valley above bottom
            int cx = x0 + tileW;         int cy = bottomY - valleyLift; // right valley above bottom
            int kx = x0 + tileW/2;       int ky = bottomY - amplitude;  // peak

            for (int i = 0; i <= samplesPerTile; i++) {
                double t = i / (double)samplesPerTile;
                double mt = 1.0 - t;
                int ix = (int)Math.round(mt*mt*ax + 2*mt*t*kx + t*t*cx);
                int iy = (int)Math.round(mt*mt*ay + 2*mt*t*ky + t*t*cy);
                if (ix == prevx && iy == prevy) continue;
                if (ix >= -10 && ix <= panelWidth + 10) {
                    xs[n] = ix; ys[n] = iy; n++;
                    prevx = ix; prevy = iy;
                    if (n >= xs.length - 4) break;
                }
            }
            if (n >= xs.length - 4) break;
        }

        xs[n] = panelWidth + 10; ys[n] = bottomY; n++;
        xs[n] = -10;            ys[n] = bottomY; n++;
        xs[n] = xs[0];          ys[n] = ys[0];   n++;

        g2d.fillPolygon(xs, ys, n);
    }
}
