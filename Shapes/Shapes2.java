//Celena Williams

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;

public class Shapes2 extends JFrame {
    public Shapes2 () {
        super ("Drawing 2D shapes");

        setSize (425, 160);
        setVisible (true);
    }//END public Shapes2 ()

    public void paint (Graphics g) {
        super.paint (g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint (new GradientPaint (5, 30, Color.BLUE, 35, 100, 
                                         Color.YELLOW, true));
        g2d.fill (new Ellipse2D.Double (5, 30, 65, 100));

        g2d.setPaint (Color.RED);
        g2d.setStroke (new BasicStroke (10.0f));
        g2d.draw (new Rectangle2D.Double (80, 30, 65, 100));

        BufferedImage buffImage = new BufferedImage (10, 10, 
                                                    BufferedImage.TYPE_INT_RGB);

        Graphics2D gg = buffImage.createGraphics ();

        gg.setColor (Color.YELLOW);
        gg.fillRect (0, 0, 10, 10);

        gg.setColor (Color.BLACK);
        gg.drawRect (1, 1, 6, 6);

        gg.setColor (Color.BLUE);
        gg.fillRect (1, 1, 3, 3);

        gg.setColor (Color.RED);
        gg.fillRect (4, 4, 3, 3);

        g2d.setPaint (new TexturePaint (buffImage, new Rectangle (10, 10)));
        g2d.fill (new RoundRectangle2D.Double (155, 30, 75, 100, 50, 50));

        g2d.setPaint (Color.WHITE);
        g2d.setStroke (new BasicStroke (6.0f));
        g2d.draw (new Arc2D.Double (240, 30, 75, 100, 0, 270, Arc2D.PIE));

        float dashes [] = {10};

        g2d.setPaint (Color.YELLOW);
        g2d.setStroke (new BasicStroke (4, BasicStroke.CAP_ROUND, 
                                        BasicStroke.JOIN_ROUND, 10, dashes, 0));
        g2d.draw (new Line2D.Double (320, 30, 395, 150));
    }//END public void paint (Graphics g)

    public static void main (String [] args) {
        Shapes2 application = new Shapes2 ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class Shapes2