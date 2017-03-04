//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorSelect extends JFrame {
    private JButton okButton, cancelButton;
    private JComboBox colorBox;
    private JCheckBox backgroundCheckBox, foregroundCheckBox;
    private BorderLayout containerLayout;
    private String [] red = {"RED", ""};

    public ColorSelect () {
        Container container = getContentPane ();
        containerLayout = new BorderLayout ();
        container.setLayout (containerLayout);

        okButton = new JButton ("Ok");
        cancelButton = new JButton ("Cancel");

        backgroundCheckBox = new JCheckBox ("background");
        foregroundCheckBox = new JCheckBox ("foreground");

        colorBox = new JComboBox (red);
        colorBox.setMaximumRowCount (2);
        colorBox.addItemListener (
            new ItemListener () {
                public void itemStateChanged (ItemEvent event) {
                    if (event.getStateChange () == ItemEvent.SELECTED) {
                    }//END if (event.getStateChange () == ItemEvent.SELECTED)
                }//END public void itemStateChanged (ItemEvent event)
            }//END new ItemListener ()
        );//END colorBox.addItemListener

        container.add (colorBox, BorderLayout.NORTH);
        container.add (backgroundCheckBox, BorderLayout.CENTER);
        container.add (foregroundCheckBox, BorderLayout.CENTER);
        container.add (okButton, BorderLayout.SOUTH);
        container.add (cancelButton, BorderLayout.SOUTH);
    }//END public ColorSelect ()

    public static void main (String [] args) {
        ColorSelect application = new ColorSelect ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class ColorSelect