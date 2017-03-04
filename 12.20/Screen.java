//Celena Williams

import java.awt.*;
import javax.swing.*;

public class Screen extends JFrame {
    public Screen () {
        super ("Screen");

        setSize (1000, 1000);
        setVisible (true);
    }//END public Screen ()

    public void paint (Graphics g) {
        super.paint (g);

        int counter = 1;

        while (counter <= 100) {
            g.setColor (new Color ((int) (Math.random () * 256), (int)
                        (Math.random () * 256), (int) (Math.random () * 256)));
            g.drawLine ((int) (Math.random () * 1000), (int) (Math.random () 
                        * 1000), (int) (Math.random () * 1000), (int) 
                        (Math.random () * 1000));

            counter++;
        }//END while (counter <= 100)
        repaint ();
    }//END public void paint (Graphics g)

    public static void main (String [] args) {
        Screen application = new Screen ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class Screen