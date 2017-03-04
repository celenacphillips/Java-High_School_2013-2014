//Celena Williams

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TokenTest extends JFrame {
    private JLabel promptLabel;
    private JTextField inputField;
    private JTextArea outputArea;

    public TokenTest () {
        super ("Testing Class StringTokenizer");

        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        promptLabel = new JLabel ("Enter a sentence and press Enter");
        container.add (promptLabel);

        inputField = new JTextField (20);
        inputField.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    StringTokenizer tokens = new StringTokenizer 
                                                    (event.getActionCommand ());

                    outputArea.setText ("Number of elements: " + 
                                        tokens.countTokens () + 
                                        "\nThe tokens are:\n");

                    while (tokens.hasMoreTokens ())
                        outputArea.append (tokens.nextToken () + "\n");
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END inputField.addActionListener

        container.add (inputField);

        outputArea = new JTextArea (10, 20);
        outputArea.setEditable (false);
        container.add (new JScrollPane (outputArea));
        setSize (275, 240);
        setVisible (true);
    }//END public TokenTest ()

    public static void main (String [] args) {
        TokenTest application = new TokenTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class TokenTest