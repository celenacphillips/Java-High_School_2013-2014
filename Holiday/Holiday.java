//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Holiday extends JPanel implements ActionListener {
    private final static String IMAGE_NAME = "title";
    protected ImageIcon images [];

    private int totalImages = 21;
    private int currentImage = 0;
    private int animationDelay = 3000;
    private int width;
    private int height;

    private Timer animationTimer;

    public Holiday () {
        images = new ImageIcon [totalImages];

        for (int count = 0; count < images.length; ++count)
            images [count] = new ImageIcon (getClass ().getResource 
                                     ("Assets/" + IMAGE_NAME + count + ".jpg"));

        width = images [0].getIconWidth ();
        height = images [0].getIconHeight ();
    }//END public Holiday ()

    public void paintComponent (Graphics g) {
        super.paintComponent (g);

        images [currentImage].paintIcon (this, g, 0, 0);

        if (animationTimer.isRunning ()) {
                currentImage = (currentImage + 1) % totalImages;

            if (currentImage == 6)
                g.drawLine (420, 400, 380, 510);

            if (currentImage == 7) {
                g.drawLine (420, 400, 380, 510);
                g.drawLine (420, 400, 460, 510);
            }//END if (currentImage == 7)

            if (currentImage == 8) {
                g.drawLine (420, 400, 380, 510);
                g.drawLine (420, 400, 460, 510);
                g.drawLine (460, 510, 360, 445);
            }//END if (currentImage == 8)

            if (currentImage == 9) {
                g.drawLine (420, 400, 380, 510);
                g.drawLine (420, 400, 460, 510);
                g.drawLine (460, 510, 360, 445);
                g.drawLine (360, 445, 480, 445);
            }//END if (currentImage == 9)

            if (currentImage == 10) {
                g.drawLine (420, 400, 380, 510);
                g.drawLine (420, 400, 460, 510);
                g.drawLine (460, 510, 360, 445);
                g.drawLine (360, 445, 480, 445);
                g.drawLine (480, 445, 380, 510);
            }//END if (currentImage == 10)

            if (currentImage == 11) {
                g.drawLine (420, 400, 380, 510);
                g.drawLine (420, 400, 460, 510);
                g.drawLine (460, 510, 360, 445);
                g.drawLine (360, 445, 480, 445);
                g.drawLine (480, 445, 380, 510);
                g.drawOval (355, 400, 130, 125);
            }//END if (currentImage == 11)
        }//END if (animationTimer.isRunning ())
    }//END public void paintComponent (Graphics g)

    public void actionPerformed (ActionEvent actionEvent) {
        repaint ();
    }//END public void actionPerformed (ActionEvent actionEvent)

    public void startAnimation () {
        if (animationTimer == null) {
            currentImage = 0;
            animationTimer = new Timer (animationDelay, this);
            animationTimer.start ();
        }//END if (animationTimer == null)
        else
            if (!animationTimer.isRunning ())
                animationTimer.restart ();
    }//END public void startAnimation ()

    public void stopAnimation () {
        animationTimer.stop ();
    }//END public void stopAnimation ()

    public Dimension getMinimumSize () {
        return getPreferredSize ();
    }//END public Dimension getMinimumSize ()

    public Dimension getPreferredSize () {
        return new Dimension (width, height);
    }//END public Dimension getPreferredSize ()

    public static void main (String [] args) {
        Holiday animation = new Holiday ();

        JFrame window = new JFrame ("Holiday");
        window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        Container container = window.getContentPane ();
        container.add (animation);

        window.pack ();
        window.setVisible (true);
        animation.startAnimation ();
    }//END public static void main (String [] args)
}//END public class Holiday