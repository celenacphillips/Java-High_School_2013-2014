//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabelTest extends JFrame {
    private JLabel label1, label2, label3;

    public LabelTest () {
        super ("Testing JLabel");

        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        label1 = new JLabel ("Label with text");
        label1.setToolTipText ("This is label1");
        container.add (label1);

        Icon bug = new ImageIcon ("bug.gif");
        label2 = new JLabel ("Label with text and icon", bug, 
                             SwingConstants.LEFT);
        label2.setToolTipText ("This is label2");
        container.add (label2);

        label3 = new JLabel ();
        label3.setText ("Label with icon and text at bottom");
        label3.setIcon (bug);
        label3.setHorizontalTextPosition (SwingConstants.CENTER);
        label3.setVerticalTextPosition (SwingConstants.BOTTOM);
        label3.setToolTipText ("This is label3");
        container.add (label3);

        setSize (275, 170);
        setVisible (true);
    }//END public LabelTest ()

    public static void main (String [] args) {
        LabelTest application = new LabelTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class LabelTest