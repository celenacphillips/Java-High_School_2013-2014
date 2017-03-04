//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LogoAnimator extends JPanel implements ActionListener {
    private final static String IMAGE_NAME = "deitel";
    protected ImageIcon images [];

    private int totalImages = 30;
    private int currentImage = 0;
    private int animationDelay = 50;
    private int width;
    private int height;

    private Timer animationTimer;

    public LogoAnimator () {
        images = new ImageIcon [totalImages];

        for (int count = 0; count < images.length; ++count)
            images [count] = new ImageIcon (getClass ().getResource 
                             ("images/" + IMAGE_NAME + count + ".gif"));

        width = images [0].getIconWidth ();
        height = images [0].getIconHeight ();
    }//END public LogoAnimator ()

    public void paintComponent (Graphics g) {
        super.paintComponent (g);

        images [currentImage].paintIcon (this, g, 0, 0);

        if (animationTimer.isRunning ())
            currentImage = (currentImage + 1) % totalImages;
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
        LogoAnimator animation = new LogoAnimator ();

        JFrame window = new JFrame ("Animation test");
        window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        Container container = window.getContentPane ();
        container.add (animation);

        window.pack ();
        window.setVisible (true);
        animation.startAnimation ();
    }//END public static void main (String [] args)
}//END public class LogoAnimator