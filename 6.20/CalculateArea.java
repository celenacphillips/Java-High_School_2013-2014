//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculateArea extends JApplet implements ActionListener {
    JLabel inputLabel, outputLabel;
    JTextField inputField;

    public CalculateArea () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        inputLabel = new JLabel ("Input a radius");
        container.add (inputLabel);

        inputField = new JTextField (5);
        inputField.addActionListener (this);
        container.add (inputField);

        outputLabel = new JLabel ("");
        container.add (outputLabel);
    }//END public CalculateArea ()

    public void actionPerformed (ActionEvent e) {
        double r, output;

        r = Double.parseDouble (inputField.getText ());

        output = circleArea (r);

        outputLabel.setText ("The area of a circle with the radius of " + r + 
                             " is " + output + ".");
    }//END public void actionPerformed (ActionEvent e)

    public double circleArea (double radius) {
        double result;

        result = Math.PI * (Math.pow (radius, 2));

        return result;
    }//END public double circleArea (double radius)
}//END public class CalculateArea