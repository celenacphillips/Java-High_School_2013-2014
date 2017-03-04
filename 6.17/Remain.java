//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Remain extends JApplet implements ActionListener {
    JLabel inputLabel, outputLabel;
    JTextField inputField;

    public Remain () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        inputLabel = new JLabel ("Input an integer");
        container.add (inputLabel);

        inputField = new JTextField (3);
        inputField.addActionListener (this);
        container.add (inputField);

        outputLabel = new JLabel ("");
        container.add (outputLabel);
    }//END public Remain ()

    public void actionPerformed (ActionEvent e) {
        int intNumber = Integer.parseInt (inputField.getText ());

        boolean output = isEven (intNumber);

        if (output == true)
            outputLabel.setText ("The number " + intNumber + " is even.");
        else
            outputLabel.setText ("The number " + intNumber + " is odd.");
    }//END public void actionPerformed (ActionEvent e)

    public boolean isEven (int integerNumber) {
        if (integerNumber % 2 == 0)
            return true;
        else
            return false;
    }//END public boolean isEven (int integerNumber)
}//END public class Remain