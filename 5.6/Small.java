//Celena Williams

import javax.swing.JOptionPane;

public class Small {
    public static void main (String [] args) {
        String num1, num2;

        int number1, number2;
        int small = 100000;

        num1 = JOptionPane.showInputDialog ("How many numbers do you have?");

        number1 = Integer.parseInt (num1);

        for (int i = 1; i <= number1; i++) {
            num2 = JOptionPane.showInputDialog ("Enter an integer");

            number2 = Integer.parseInt (num2);

            if (small > number2)
                small = number2;
        }

        JOptionPane.showMessageDialog (null, "The smallest integer is " + small 
                                     + ".");
    }//END public static void main (String [] args)
}//END public class Small