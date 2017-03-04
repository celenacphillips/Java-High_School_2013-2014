//Celena Williams

import java.awt.*;
import javax.swing.*;

public class CustomPanel extends JPanel {
    public final static int CIRCLE = 1, SQUARE = 2;
    private int shape;

    public void paintComponent (Graphics g) {
        super.paintComponent (g);

        if (shape == CIRCLE)
            g.fillOval (50, 10, 60, 60);
        else
            if (shape == SQUARE)
                g.fillRect (50, 10, 60, 60);
    }//END public void paintComponent (Graphics g)

    public void draw (int shapeToDraw) {
        shape = shapeToDraw;
        repaint ();
    }//END public void draw (int shapeToDraw)
}//END public class CustomPanel