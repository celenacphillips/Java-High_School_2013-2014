//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Palindrome extends JFrame implements ActionListener {
    private String forward, output1, output2;
    private String backward = "";
    private JLabel stringLabel, outputLabel1, outputLabel2;
    private JTextField stringField;
    private JButton checkButton;
    private JPanel northPanel, centerPanel, southPanel, southNorthPanel;
    private JPanel southSouthPanel;

    public Palindrome () {
        super ("Palindromes");

        stringField = new JTextField (20);
        checkButton = new JButton ("Check");
        stringLabel = new JLabel ("Enter a word");
        outputLabel1 = new JLabel ("");
        outputLabel2 = new JLabel ("");
        northPanel = new JPanel ();
        centerPanel = new JPanel ();
        southPanel = new JPanel ();
        southNorthPanel = new JPanel ();
        southSouthPanel = new JPanel ();

        Container container = getContentPane ();
        container.setLayout (new BorderLayout ());
        southPanel.setLayout (new BorderLayout ());

        container.add (northPanel, BorderLayout.NORTH);
        container.add (centerPanel, BorderLayout.CENTER);
        container.add (southPanel, BorderLayout.SOUTH);

        northPanel.add (stringLabel);
        northPanel.add (stringField);
        centerPanel.add (checkButton);
        southPanel.add (southNorthPanel, BorderLayout.NORTH);
        southPanel.add (southSouthPanel, BorderLayout.SOUTH);
        southNorthPanel.add (outputLabel1);
        southSouthPanel.add (outputLabel2);

        checkButton.addActionListener (this);

        setSize (500, 200);
        setVisible (true);
    }//END public Palindrome ()

    public void actionPerformed (ActionEvent e) {
        forward = stringField.getText ();
        forward = forward.toLowerCase ();

        for (int i = forward.length () - 1; i >= 0; i--)
            backward += forward.charAt (i);

        if (backward.equals (forward)) {
            output1 = "Yes, you entered a palindrome";
            output2 = forward + " == " + backward;
        }//END if (backward.equals (forward))
        else {
            output1 = "No, you did not enter a palindrome";
            output2 = forward + " != " + backward;
        }//eND else

        outputLabel1.setText (output1);
        outputLabel2.setText (output2);

        forward = "";
        backward = "";
        stringField.setText ("");
        stringField.requestFocus ();
    }//END public void actionPerformed (ActionEvent e)

    public static void main (String [] args) {
        Palindrome application = new Palindrome ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//eND public static void main (String [] args)
}//END public class Palindrome