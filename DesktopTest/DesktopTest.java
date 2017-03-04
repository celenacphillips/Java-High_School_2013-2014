//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DesktopTest extends JFrame {
    private JDesktopPane theDesktop;

    public DesktopTest () {
        super ("Using a JDesktopPane");

        JMenuBar bar = new JMenuBar ();
        JMenu addMenu = new JMenu ("Add");
        JMenuItem newFrame = new JMenuItem ("Internal Frame");

        addMenu.add (newFrame);
        bar.add (addMenu);

        setJMenuBar (bar);

        theDesktop = new JDesktopPane ();
        getContentPane ().add (theDesktop);

        newFrame.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    JInternalFrame frame = new JInternalFrame ("Internal Frame",
                                                        true, true, true, true);

                    Container container = frame.getContentPane ();
                    MyJPanel panel = new MyJPanel ();
                    container.add (panel, BorderLayout.CENTER);

                    frame.pack ();

                    theDesktop.add (frame);
                    frame.setVisible (true);
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END newFrame.addActionListener

        setSize (600, 460);
        setVisible (true);
    }//END public DesktopTest ()

    public static void main (String [] args) {
        DesktopTest application = new DesktopTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class DesktopTest

class MyJPanel extends JPanel {
    private ImageIcon imageIcon;
    private String [] images = {"yellowflowers.png", "purpleflowers.png", 
                                "redflowers.png", "redflowers2.png", 
                                "lavenderflowers.png"};

    public MyJPanel () {
        int randomNumber = (int) (Math.random () * 5);
        imageIcon = new ImageIcon (images [randomNumber]);
    }//END public MyJPanel ()

    public void paintComponent (Graphics g) {
        super.paintComponent (g);

        imageIcon.paintIcon (this, g, 0, 0);
    }//END public void paintComponent (Graphics g)

    public Dimension getPreferredSize () {
        return new Dimension (imageIcon.getIconWidth (), 
                              imageIcon.getIconHeight ());
    }//END public Dimension getPreferredSize ()
}//END class MyJPanel