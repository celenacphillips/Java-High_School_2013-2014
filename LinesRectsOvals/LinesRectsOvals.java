//Celena Williams

import java.awt.*;
import javax.swing.*;

public class LinesRectsOvals extends JFrame {
    public LinesRectsOvals () {
        super ("Drawing lines, rectangles, and ovals");

        setSize (400, 165);
        setVisible (true);
    }//END public LinesRectsOvals ()

    public void paint (Graphics g) {
        super.paint (g);

        g.setColor (Color.RED);
        g.drawLine (5, 30, 350, 30);

        g.setColor (Color.BLUE);
        g.drawRect (5, 40, 90, 55);
        g.fillRect (100, 40, 90, 55);

        g.setColor (Color.CYAN);
        g.fillRoundRect (195, 40, 90, 55, 50, 50);
        g.drawRoundRect (290, 40, 90, 55, 20, 20);

        g.setColor (Color.YELLOW);
        g.draw3DRect (5, 100, 90, 55, true);
        g.fill3DRect (100, 100, 90, 55, false);

        g.setColor (Color.MAGENTA);
        g.drawOval (195, 100, 90, 55);
        g.fillOval (290, 100, 90, 55);
    }//END public void paint (Graphics g)

    public static void main (String [] args) {
        LinesRectsOvals application = new LinesRectsOvals ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class LinesRectsOvals