//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rectangle extends JFrame {
    private JLabel areaLabel;
    private int x1, y1, x2, y2;

    public Rectangle () {
        areaLabel = new JLabel ();
        getContentPane ().add (areaLabel, BorderLayout.SOUTH);
        getContentPane ().setBackground (Color.BLACK);
        areaLabel.setForeground (Color.WHITE);

        addMouseListener (new MouseClickHandler ());

        setSize (500, 500);
        setVisible (true);
    }//END public Rectangle ()

    public void paint (Graphics g) {
        super.paint (g);

        g.setColor (Color.CYAN);
        g.fillRect (x1, y1, (x2 - x1), (y2 - y1));
    }//END public void paint (Graphics g)

    public static void main (String [] args) {
        Rectangle application = new Rectangle ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)

    private class MouseClickHandler extends MouseAdapter {
        public void mousePressed (MouseEvent event) {
            x1 = event.getX ();
            y1 = event.getY ();
            areaLabel.setForeground (Color.RED);

            repaint ();
        }//END public void mousePressed (MouseEvent event)
        
        public void mouseReleased (MouseEvent event) {
            x2 = event.getX ();
            y2 = event.getY ();
            areaLabel.setForeground (Color.WHITE);

            areaLabel.setText ("Area: " + ((x2 - x1) * (y2 - y1)) + " pixels");

            repaint ();
        }//END public void mouseReleased (MouseEvent event)

        public void mouseExited (MouseEvent event) {
            areaLabel.setBackground (Color.BLACK);
            areaLabel.setForeground (Color.WHITE);
            areaLabel.setText ("Mouse outside window");

            repaint ();
        }//END public void mouseExited (MouseEvent event)

        public void mouseDragged (MouseEvent event) {
            areaLabel.setForeground (Color.RED);
            areaLabel.setText (event.getX () + ", " + event.getY ());

            repaint ();
        }//END public void mouseDragged (MouseEvent event)

        public void mouseClicked (MouseEvent event) {
            x1 = event.getX ();
            y1 = event.getY ();

            areaLabel.setForeground (Color.WHITE);
            areaLabel.setText (event.getX () + ", " + event.getY ());

            repaint ();
        }//END public void mouseClicked (MouseEvent event)

        public void mouseEntered (MouseEvent event) {
                areaLabel.setForeground (Color.WHITE);
                areaLabel.setText (event.getX () + ", " + event.getY ());

                repaint ();
        }//END public void mouseEntered (MouseEvent event)

        public void mouseMoved (MouseEvent event) {
            areaLabel.setForeground (Color.WHITE);
            areaLabel.setText (event.getX () + ", " + event.getY ());

            repaint ();
        }//END public void mouseMoved (MouseEvent event)
    }//END private class MouseClickHandler extends MouseAdapter
}//END public class Rectangle