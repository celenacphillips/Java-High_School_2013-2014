//Celena Williams

import java.awt.*;
import javax.swing.*;

public class OvalPanel extends JPanel {
    private int diameter = 10;

    public void paintComponent (Graphics g) {
        super.paintComponent (g);
        g.fillOval (10, 10, diameter, diameter);
    }//END public void paintComponent (Graphics g)

    public void setDiameter (int newDiameter) {
        diameter = (newDiameter >= 0 ? newDiameter : 10);
        repaint ();
    }//END public void setDiameter (int newDiameter)

    public Dimension getPreferredSize () {
        return getPreferredSize ();
    }//END public Dimension getPreferredSize ()
}//END public class OvalPanel