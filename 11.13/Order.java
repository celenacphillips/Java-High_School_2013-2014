//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Order extends JFrame implements ActionListener {
    private JLabel inputLabel;
    private JTextField inputField;
    private JButton enterButton;
    private JTextArea outputArea;

    public Order () {
        super ("Reversing a sentence");

        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        inputLabel = new JLabel ("Enter a sentence");
        container.add (inputLabel);

        inputField = new JTextField (20);
        inputField.addActionListener (this);
        container.add (inputField);

        enterButton = new JButton ("Enter");
        enterButton.addActionListener (this);
        container.add (enterButton);

        outputArea = new JTextArea (10, 20);
        outputArea.setEditable (false);
        container.add (outputArea);

        setSize (275, 240);
        setVisible (true);
    }//END public Order ()

    public void actionPerformed (ActionEvent e) {
        StringTokenizer tokens = new StringTokenizer (inputField.getText ());

        outputArea.setText ("");

        while (tokens.hasMoreTokens ())
            outputArea.append (tokens.nextToken () + " ");
    }//END public void actionPerformed (ActionEvent e)

    public static void main (String [] args) {
        Order application = new Order ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class Order