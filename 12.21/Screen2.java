//Celena Williams

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Screen2 extends JFrame implements ActionListener {
    public Screen2 () {
        super ("Screen2");

        setSize (1000, 1000);
        setVisible (true);

        Timer timer = new Timer (1000, this);
        timer.start ();
    }//END public Screen2 ()

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
    }//END public void paint (Graphics g)

    public void actionPerformed (ActionEvent e) {
        repaint ();
    }//END public void actionPerformed (ActionEvent e)

    public static void main (String [] args) {
        Screen2 application = new Screen2 ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class Screen2