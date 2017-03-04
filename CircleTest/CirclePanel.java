//Celena Williams

import java.awt.*;
import javax.swing.*;

public class CirclePanel extends JPanel {
    public final static int DRAW = 1;
    private int shape;

    public void paintComponent (Graphics g) {
        super.paintComponent (g);

        int diameter = (int) (Math.random () * 500);

        if (shape == DRAW)
            g.setColor (Color.CYAN);
            g.fillOval (10, 10, diameter, diameter);
    }//END public void paintComponent (Graphics g)

    public void draw (int shapeToDraw) {
        shape = shapeToDraw;
        repaint ();
    }//END public void draw (int shapeToDraw)
}//END public class CirclePanel