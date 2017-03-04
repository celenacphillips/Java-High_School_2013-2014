//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Square extends JApplet implements ActionListener {
    JLabel inputLabel1, inputLabel2;
    JTextField inputField1, inputField2;
    JTextArea outputArea;
    JPanel northPanel;

    public void init () {
        Container container = getContentPane ();

        northPanel = new JPanel ();
        northPanel.setLayout (new FlowLayout ());
        container.add (northPanel, BorderLayout.NORTH);

        inputLabel1 = new JLabel ("Enter a number");
        northPanel.add (inputLabel1);

        inputField1 = new JTextField (3);
        inputField1.addActionListener (this);
        inputField1.requestFocus ();
        northPanel.add (inputField1);

        inputLabel2 = new JLabel ("Enter a character");
        northPanel.add (inputLabel2);

        inputField2 = new JTextField (3);
        inputField2.addActionListener (this);
        northPanel.add (inputField2);

        outputArea = new JTextArea ("");
        outputArea.setEditable (false);
        container.add (outputArea, BorderLayout.CENTER);
    }//END public void init ()

    public void actionPerformed (ActionEvent e) {
        int Side = Integer.parseInt (inputField1.getText ());

        String FillCharacter = inputField2.getText ();

        String Output = squareOfAsterisks (Side, FillCharacter);

        outputArea.setText (Output);
    }//END public void actionPerformed (ActionEvent e)

    public String squareOfAsterisks (int side, String fillCharacter) {
            String output = "";
            String output2 = "";

            for (int i = 0; i < side; i++)
                output += fillCharacter;

            for (int j = 1; j < side; j++)
                output2 += output + "\n";

            output2 += output;

            return output2;
    }//END public String squareOfAsterisks (int side, String fillCharacter)
}//END public class Square