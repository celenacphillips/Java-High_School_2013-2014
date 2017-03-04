//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Painter extends JFrame {
    private int pointCount = 0;

    private Point points [] = new Point [1000];

    public Painter () {
        super ("A simple paint program");

        getContentPane ().add (new JLabel ("Drag the mouse to draw"), 
                                                            BorderLayout.SOUTH);

        addMouseMotionListener (
            new MouseMotionAdapter () {
                public void mouseDragged (MouseEvent event) {
                    if (pointCount < points.length) {
                        points [pointCount] = event.getPoint ();
                        ++pointCount;
                        repaint ();
                    }//eND if (pointCount < points.length)
                }//END public void mouseDragged (MouseEvent event)
            }//END new MouseMotionAdapter ()
        );//END addMouseMotionListener

        setSize (300, 150);
        setVisible (true);
    }//END public Painter ()

    public void paint (Graphics g) {
        super.paint (g);

        for (int i = 0; i < points.length && points [i] != null; i++)
            g.fillOval (points [i].x, points [i].y, 4, 4);
    }//END public void paint (Graphics g)

    public static void main (String [] args) {
        Painter application = new Painter ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class Painter