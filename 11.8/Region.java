//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Region extends JApplet implements ActionListener {
    JLabel inputLabel1, inputLabel2, outputLabel;
    JTextField inputField1, inputField2;
    JButton enterButton;

    public void init () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        inputLabel1 = new JLabel ("Enter the first word");
        container.add (inputLabel1);

        inputField1 = new JTextField (4);
        container.add (inputField1);

        inputLabel2 = new JLabel ("Enter the second word");
        container.add (inputLabel2);

        inputField2 = new JTextField (4);
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

        String Output = matching (Str1, Str2);

        outputLabel.setText (Output);
    }//END public void actionPerformed (ActionEvent e)

    public String matching (String str1, String str2) {
        String output;

        if (str1.regionMatches (true, 0, str2, 0, 5))
            output = "The first string and the second string are equal.";
        else
            output = "The first string and the second string are not equal.";

        return output;
    }//END public String matching (String str1, String str2)
}//END public class Region