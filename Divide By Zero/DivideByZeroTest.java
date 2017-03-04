//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DivideByZeroTest extends JFrame implements ActionListener {
    private JTextField inputField1, inputField2, outputField;
    private int number1, number2, result;

    public DivideByZeroTest () {
        super ("Demonstrating Exceptions");

        Container container = getContentPane ();
        container.setLayout (new GridLayout (3,2 ));

        container.add (new JLabel ("Enter numerator", SwingConstants.RIGHT));
        inputField1 = new JTextField ();
        container.add (inputField1);

        container.add (new JLabel ("Enter denominator and press Enter", 
                                   SwingConstants.RIGHT));
        inputField2 = new JTextField ();
        container.add (inputField2);
        inputField2.addActionListener (this);

        container.add (new JLabel ("RESULT ", SwingConstants.RIGHT));
        outputField = new JTextField ();
        container.add (outputField);

        setSize (425, 100);
        setVisible (true);
    }//END public DivideByZeroTest ()

    public void actionPerformed (ActionEvent e) {
        outputField.setText ("");

        try {
                number1 = Integer.parseInt (inputField1.getText ());
                number2 = Integer.parseInt (inputField2.getText ());
                result = quotient (number1, number2);
                outputField.setText (String.valueOf (result));
        }//END try
        catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog (this,
                                               "You must enter two integers",
                                               "Invalid Number Format", 
                                               JOptionPane.ERROR_MESSAGE);
        }//END catch (NumberFormatException numberFormatException)
        catch (ArithmeticException arithmeticException) {
            JOptionPane.showMessageDialog (this, arithmeticException.toString(),
                                           "Arithmetic Exception",
                                           JOptionPane.ERROR_MESSAGE);
        }//END catch (ArithmeticException arithmeticException)
    }//END public void actionPerformed (ActionEvent e)

    public int quotient (int numerator, int denominator)
    throws ArithmeticException {
        return numerator / denominator;
    }//END public int quotient (int numerator, int denominator)

    public static void main (String [] args) {
        DivideByZeroTest application = new DivideByZeroTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class DivideByZeroTest