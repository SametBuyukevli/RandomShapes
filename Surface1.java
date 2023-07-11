package randomShapes;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

class Surface1 extends JPanel {

    private void Drawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        Random random = new Random();

        int gw = getWidth() - 1;
        int gh = getHeight() - 1;

        BasicStroke bs1 = new BasicStroke(2, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs1);


        for (int i = 0; i < 10; i++) {

            for (int y = 0; y < 8; y++) {

                g2d.setColor(new Color(random.nextInt()));
                g2d.fillRect(i * (gw / 10), y * (gh / 8),
                        gw / 10, gh / 8);
            }
        }

        g2d.setColor(Color.BLACK);
        g2d.drawRect(0, 0,  gw-10, gh-4);

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Drawing(g);
    }
}


