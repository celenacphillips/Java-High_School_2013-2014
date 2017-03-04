//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RoundedNumber extends JApplet implements ActionListener {
    JLabel doubleLabel, outputLabel;
    JTextField doubleField;
    JButton calculateButton;

    int y;

    public RoundedNumber () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        doubleLabel = new JLabel ("Enter a double value");
        container.add (doubleLabel);

        doubleField = new JTextField (5);
        container.add (doubleField);

        calculateButton = new JButton ("Calculate");
        calculateButton.addActionListener (this);
        container.add (calculateButton);

        outputLabel = new JLabel ("");
        container.add (outputLabel);
    }//END public RoundedNumber ()

    public void actionPerformed (ActionEvent e) {
        double value;
        int output;

        value = Double.parseDouble (doubleField.getText ());

        output = rounding (value);

        outputLabel.setText ("The original number: " + value + 
                             "\nThe rounded number: " + output);
    }//END public void actionPerformed (ActionEvent e)

    public int rounding (double x) {
        y = (int) (Math.floor (x + 0.5));

        return y;
    }//END public int rounding (double x)
}//END public class RoundedNumber