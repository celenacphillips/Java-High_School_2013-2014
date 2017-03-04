//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Square extends JApplet implements ActionListener {
    JLabel inputLabel;
    JTextField inputField;
    JTextArea outputArea;
    JPanel northPanel;

    public void init () {
        Container container = getContentPane ();

        northPanel = new JPanel ();
        northPanel.setLayout (new FlowLayout ());
        container.add (northPanel, BorderLayout.NORTH);

        inputLabel = new JLabel ("Enter a number");
        northPanel.add (inputLabel);

        inputField = new JTextField (3);
        inputField.addActionListener (this);
        inputField.requestFocus ();
        northPanel.add (inputField);

        outputArea = new JTextArea ("");
        outputArea.setEditable (false);
        container.add (outputArea, BorderLayout.CENTER);
    }//END public void init ()

    public void actionPerformed (ActionEvent e) {
        int Side = Integer.parseInt (inputField.getText ());

        String Output = squareOfAsterisks (Side);

        outputArea.setText (Output);
    }//END public void actionPerformed (ActionEvent e)

    public String squareOfAsterisks (int side) {
            String output = "";
            String output2 = "";

            for (int i = 0; i < side; i++)
                output+= "*";

            for (int j = 1; j < side; j++)
                output2 += output + "\n";

            output2 += output;

            return output2;
    }//END public String squareOfAsterisks (int side)
}//ENDpublic class Square 