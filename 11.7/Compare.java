//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Compare extends JApplet implements ActionListener {
    JLabel inputLabel1, inputLabel2, outputLabel;
    JTextField inputField1, inputField2;
    JButton enterButton;

    public void init () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        inputLabel1 = new JLabel ("Enter the first word");
        container.add (inputLabel1);

        inputField1 = new JTextField (10);
        container.add (inputField1);

        inputLabel2 = new JLabel ("Enter the second word");
        container.add (inputLabel2);

        inputField2 = new JTextField (10);
        inputField2.addActionListener (this);
        container.add (inputField2);

        enterButton = new JButton ("Enter");
        enterButton.addActionListener (this);
        container.add (enterButton);

        outputLabel = new JLabel ("");
        container.add (outputLabel);
    }//END public void init ()

    public void actionPerformed (ActionEvent e) {
        String Str1 = inputField1.getText ();
        String Str2 = inputField2.getText ();

        String Output = comparing (Str1, Str2);

        outputLabel.setText (Output);
    }//END public void actionPerformed (ActionEvent e)

    public String comparing (String str1, String str2) {
        String output;

        if (str1.compareTo (str2) == str2.compareTo (str1))
            output = "The first string is equal to the second string.";
        else
            if (str1.compareTo (str2) > str2.compareTo (str1))
                output = "The first string is greater than the second string.";
            else
                output = "The first string is less than the second string.";

        return output;
    }//END public String comparing (String str1, String str2
}//END public class Compare