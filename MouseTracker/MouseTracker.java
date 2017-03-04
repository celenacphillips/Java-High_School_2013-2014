//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseTracker extends JFrame implements MouseListener,
                                                    MouseMotionListener {
    private JLabel statusBar;

    public MouseTracker () {
        super ("Demonstrating Mouse Events");

        statusBar = new JLabel ();
        getContentPane ().add (statusBar, BorderLayout.SOUTH);

        addMouseListener (this);
        addMouseMotionListener (this);

        setSize (275, 100);
        setVisible (true);
    }//END public MouseTracker ()

    public void mouseClicked (MouseEvent event) {
        statusBar.setText ("Clicked at [" + event.getX () + ", " + 
                           event.getY () + "]");
    }//END public void mouseClicked (MouseEvent event)

    public void mousePressed (MouseEvent event) {
        statusBar.setText ("Pressed at [" + event.getX () + ", " + 
                           event.getY () + "]");
    }//END public void mousePressed (MouseEvent event)

    public void mouseReleased (MouseEvent event) {
        statusBar.setText ("Released at [" + event.getX () + ", " + 
                           event.getY () + "]");
    }//END public void mouseReleased (MouseEvent event)

    public void mouseEntered (MouseEvent event) {
        statusBar.setText ("Entered at [" + event.getX () + ", " + 
                           event.getY () + "]");
        getContentPane ().setBackground (Color.GREEN);
    }//END public void mouseEntered (MouseEvent event)

    public void mouseExited (MouseEvent event) {
        statusBar.setText ("Mouse outside window");
        getContentPane ().setBackground (Color.WHITE);
    }//END public void mouseExited (MouseEvent event)

    public void mouseDragged (MouseEvent event) {
        statusBar.setText ("Dragged at [" + event.getX () + ", " + 
                           event.getY () + "]");
    }//END public void mouseDragged (MouseEvent event)

    public void mouseMoved (MouseEvent event) {
        statusBar.setText ("Moved at [" + event.getX () + ", " + 
                           event.getY () + "]");
    }//END public void mouseMoved (MouseEvent event)

    public static void main (String [] args) {
        MouseTracker application = new MouseTracker ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class MouseTracker