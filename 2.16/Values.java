//Celena Williams

import javax.swing.JOptionPane;

public class Values {
    public static void main (String [] args) {
        String firstNumber, secondNumber;

        int num1, num2;
        double sum, difference, product, quotient;

        firstNumber = JOptionPane.showInputDialog ("Enter first integer");
        secondNumber = JOptionPane.showInputDialog ("Enter second integer");

        num1 = Integer.parseInt (firstNumber);
        num2 = Integer.parseInt (secondNumber);

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;

        JOptionPane.showMessageDialog (null, "The sum is " + sum + 
                                       "\nThe difference is " + difference + 
                                       "\nThe product is " + product + 
                                       "\nThe quotient is " + quotient, 
                                       "Results", JOptionPane.PLAIN_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class Values