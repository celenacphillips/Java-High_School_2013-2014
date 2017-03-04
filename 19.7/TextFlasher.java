//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFlasher extends JPanel implements ActionListener {
    ImageIcon images [];
    int totalImages = 2;
    int currentImage = 0;
    int animationDelay = 150;

    Timer timer;

    public TextFlasher () {
        images = new ImageIcon [totalImages];

        images [0] = new ImageIcon (getClass ().getResource ("text0.gif"));
        images [1] = new ImageIcon (getClass ().getResource ("text1.gif"));
    }//END public TextFlasher ()

    public void paintComponent (Graphics g) {
        images [currentImage].paintIcon (this, g, 0, 0);

        if (timer.isRunning ())
            currentImage = (currentImage + 1) % totalImages;
    }//END public void paintComponent (Graphics g)

    public void actionPerformed (ActionEvent actionEvent) {
        repaint ();
    }//END public void actionPerformed (ActionEvent actionEvent)

    public void startAnimation () {
            if (timer == null) {
                currentImage = 0;
                timer = new Timer (animationDelay, this);
                timer.start ();
            }//END if (timer == null)
            else
                if (!timer.isRunning ())
                    timer.restart ();
    }//END public void startAnimation ()

    public static void main (String [] args) {
        TextFlasher animation = new TextFlasher ();

        JFrame window = new JFrame ("TextFlasher");
        window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        Container container = window.getContentPane ();
        container.add (animation);

        window.setSize (600, 600);
        window.setVisible (true);
    }//END public static void main (String [] args)
}//END public class TextFlasher