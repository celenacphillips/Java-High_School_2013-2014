//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StaticCharMethods2 extends JFrame {
    private char c;
    private int digit, radix;
    private JLabel prompt1, prompt2;
    private JTextField input, radixField;
    private JButton toChar, toInt;

    public StaticCharMethods2 () {
        super ("Character Conversion Methods");

        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        prompt1 = new JLabel ("Enter a digit or character ");
        input = new JTextField (5);

        container.add (prompt1);
        container.add (input);

        prompt2 = new JLabel ("Enter a radix ");
        radixField = new JTextField (5);

        container.add (prompt2);
        container.add (radixField);

        toChar = new JButton ("Convert digit to character");
        toChar.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    digit = Integer.parseInt (input.getText ());
                    radix = Integer.parseInt (radixField.getText ());
                    JOptionPane.showMessageDialog (null, 
                                                  "Convert digit to character: " 
                                           + Character.forDigit (digit, radix));
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END toChar.addActionListener

        toInt = new JButton ("Convert character to digit");
        toInt.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    String s = input.getText ();
                    c = s.charAt (0);
                    radix = Integer.parseInt (radixField.getText ());
                    JOptionPane.showMessageDialog (null, 
                                                   "Convert character to digit " 
                                                 + Character.digit (c, radix));
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END toInt.addActionListener

        container.add (toChar);
        container.add (toInt);
        setSize (275, 150);
        setVisible (true);
    }//END public StaticCharMethods2 ()

    public static void main (String [] args) {
        StaticCharMethods2 application = new StaticCharMethods2 ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class StaticCharMethods2