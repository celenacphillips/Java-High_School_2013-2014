//Celena Williams

import java.awt.*;
import javax.swing.*;

public class Align extends JFrame {
    private JPanel leftPanel, centerPanel, rightPanel;
    private JButton okButton, cancelButton, helpButton;
    private JCheckBox snapToGridCheckBox, showGridCheckBox;
    private JLabel xLabel, yLabel;
    private JTextField xTextField, yTextField;
    private Container container;

    public Align () {
        container = getContentPane ();
        container.setLayout (new GridLayout (1, 3));

        rightPanel.setLayout (new BorderLayout (3, 3));
        centerPanel.setLayout (new FlowLayout ());
        leftPanel.setLayout (new FlowLayout ());

        okButton = new JButton ("OK");
        cancelButton = new JButton ("CANCEL");
        helpButton = new JButton ("HELP");

        xLabel = new JLabel ("X: ");
        xTextField = new JTextField ("");
        yLabel = new JLabel ("Y: ");
        yTextField = new JTextField ("");

        snapToGridCheckBox = new JCheckBox ("Snap to Grid");
        showGridCheckBox = new JCheckBox ("Show Grid");

        container.add (rightPanel);
        container.add (centerPanel);
        container.add (leftPanel);

        rightPanel.add (okButton, BorderLayout.NORTH);
        rightPanel.add (cancelButton, BorderLayout.CENTER);
        rightPanel.add (helpButton, BorderLayout.SOUTH);

        centerPanel.add (xLabel);
        centerPanel.add (xTextField);
        centerPanel.add (yLabel);
        centerPanel.add (yTextField);

        leftPanel.add (snapToGridCheckBox);
        leftPanel.add (showGridCheckBox);


        setSize (300, 100);
        setVisible (true);
    }//END public Align ()

    public static void main (String [] args) {
        Align f = new Align ();
        f.setBounds (100, 100, 400, 400);
        f.setVisible (true);
    }//END public static void main (String [] args)
}//END public class Align