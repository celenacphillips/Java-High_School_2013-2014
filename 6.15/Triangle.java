//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Triangle extends JApplet implements ActionListener {
    JLabel side1Label, side2Label, outputLabel;
    JTextField side1Field, side2Field;

    public Triangle () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        side1Label = new JLabel ("Side 1");
        container.add (side1Label);

        side1Field = new JTextField (5);
        container.add (side1Field);

        side2Label = new JLabel ("Side 2 (Press Enter after this field)");
        container.add (side2Label);

        side2Field = new JTextField (5);
        side2Field.addActionListener (this);
        container.add (side2Field);

        outputLabel = new JLabel ("");
        container.add (outputLabel);
    }//END public Triangle ()

    public void actionPerformed (ActionEvent e) {
        double sideA, sideB, sideC;

        sideA = Double.parseDouble (side1Field.getText ());
        sideB = Double.parseDouble (side2Field.getText ());

        sideC = hypotenuse (sideA, sideB);

        outputLabel.setText ("The hypotenuse of " + sideA + " and " + sideB + 
                             " is " + sideC + ".");
    }//END public void actionPerformed (ActionEvent e)

    public double hypotenuse (double side1, double side2) {
        double side3;

        side3 = Math.sqrt ((Math.pow (side1, 2) + Math.pow (side2, 2)));

        return side3;
    }//END public double hypotenuse (double side1, double side2)
}//END public class Triangle