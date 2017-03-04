//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StaticCharMethods extends JFrame {
    private char c;
    private JLabel promptLabel;
    private JTextField inputField;
    private JTextArea outputArea;

    public StaticCharMethods () {
        super ("Static Character Methods");

        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        promptLabel = new JLabel ("enter a character and press Enter");
        container.add (promptLabel);

        inputField = new JTextField (5);
        inputField.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    String s = event.getActionCommand ();
                    c = s.charAt (0);
                    buildOutput ();
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END inputField.addActionListener
        container.add (inputField);

        outputArea = new JTextArea (10, 20);
        container.add (outputArea);

        setSize (300, 220);
        setVisible (true);
    }//END public StaticCharMethods ()

    private void buildOutput () {
        outputArea.setText ("is defined: " + Character.isDefined (c) +
                            "\nis digit: " + Character.isDigit (c) +
                            "\nis first character in a Java identifier: " + 
                            Character.isJavaIdentifierStart (c) +
                            "\nis part of a Java identifier: " + 
                            Character.isJavaIdentifierPart (c) +
                            "\nis letter: " + Character.isLetter (c) +
                            "\nis letter or digit: " + 
                            Character.isLetterOrDigit (c) +
                            "\nis lower case: " + Character.isLowerCase (c) +
                            "\nis upper case: " + Character.isUpperCase (c) +
                            "\nto upper case: " + Character.toUpperCase (c) +
                            "\nto lower case: " + Character.toLowerCase (c));
    }//END private void buildOutput ()

    public static void main (String [] args) {
        StaticCharMethods application = new StaticCharMethods ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class StaticCharMethods