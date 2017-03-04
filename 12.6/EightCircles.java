//Celena Williams

import java.awt.*;
import javax.swing.*;

public class EightCircles extends JFrame {
    int xTwo = 50;
    int yTwo = 50;

    public EightCircles () {
        super ("Eight Circles");

        setSize (300, 300);
        setVisible (true);
    }//END public EightCircles ()

    public void paint (Graphics g) {
        super.paint (g);

        for (int count = 0; count < 8; count++) {
            xTwo += 10;
            yTwo += 10;

            g.drawOval (50, 50, xTwo, yTwo);
        }//END for (int count = 0; count < 8; count++)
    }//END public void paint (Graphics g)

    public static void main (String [] args) {
        EightCircles application = new EightCircles ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class EightCircles