//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageMap extends JApplet {
    private ImageIcon mapImage;

    private static final String captions [] = {"Common Programming Error", 
                                               "Good Programming Practice", 
                                               "Graphical User Interface Tip", 
                                               "Performance Tip", 
                                               "Portability Tip", 
                                             "Software Engineering Observation", 
                                               "Error-Prevention Tip"};

    public void init () {
        addMouseListener (
            new MouseAdapter () {
                public void mouseExited (MouseEvent event) {
                    showStatus ("Pointer outside applet");
                }//END public void mouseExited (MouseEvent event)
            }//END new MouseAdapter ()
        );//END addMouseMotionListener

        addMouseMotionListener (
            new MouseMotionAdapter () {
                public void mouseMoved (MouseEvent event) {
                    showStatus (translateLocation (event.getX(), event.getY()));
                }//END public void mouseMoved (MouseEvent event)
            }//END new MouseMotionAdapter ()
        );//END addMouseMotionListener

        mapImage = new ImageIcon ("icons.png");
    }//END public void init ()

    public void paint (Graphics g) {
        super.paint (g);
        mapImage.paintIcon (this, g, 0, 0);
    }//END public void paint (Graphics g)

    public String translateLocation (int x, int y) {
        if (x >= mapImage.getIconWidth () || y >= mapImage.getIconHeight ())
            return "";

        int iconWidth = mapImage.getIconWidth () / 7;
        int iconNumber = x / iconWidth;

        return captions [iconNumber];
    }//END public String translateLocation (int x, int y)
}//END public class ImageMap