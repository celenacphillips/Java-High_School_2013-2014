//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SmallNumber extends JApplet implements ActionListener {
    JLabel label1, label2, label3;
    JTextField field1, field2, field3;
    JButton calculateButton;

    public SmallNumber () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        label1 = new JLabel ("Number 1");
        container.add (label1);

        field1 = new JTextField (5);
        container.add (field1);

        label2 = new JLabel ("Number 2");
        container.add (label2);

        field2 = new JTextField (5);
        container.add (field2);

        label3 = new JLabel ("Number 3");
        container.add (label3);

        field3 = new JTextField (5);
        container.add (field3);

        calculateButton = new JButton ("Calculate");
        calculateButton.addActionListener (this);
        container.add (calculateButton);
    }//END public SmallNumber ()

    public void actionPerformed (ActionEvent e) {
        float num1, num2, num3, output;

        num1 = Float.parseFloat (field1.getText ());
        num2 = Float.parseFloat (field2.getText ());
        num3 = Float.parseFloat (field3.getText ());

        output = minimum3 (num1, num2, num3);

        showStatus ("The minimum of " + num1 + ", " + num2 + ", and " + num3 + 
                    " is " + output + ".");
    }//END public void actionPerformed (ActionEvent e)

    public float minimum3 (float val1, float val2, float val3) {
        float result;

        result = Math.min (val1, Math.min (val2, val3));

        return result;
    }//END public float minimum3 (float val1, float val2, float val3)
}//END public class SmallNumber