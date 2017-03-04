//Celena Williams

import javax.swing.JOptionPane;

public class Numbers {
    public static void main (String [] args) {
        String number1, number2;

        int num1, num2;

        number1 = JOptionPane.showInputDialog ("Enter the first number");
        number2 = JOptionPane.showInputDialog ("Enter the second number");

        num1 = Integer.parseInt (number1);
        num2 = Integer.parseInt (number2);

        if (num2 % num1 == 0)
            JOptionPane.showMessageDialog (null, 
                                      "The first is a multiple of the second.");
        else
            if (num2 % num1 != 0)
                JOptionPane.showMessageDialog (null, 
                                  "The first is not a multiple of the second.");
    }//END public static void main (String [] args)
}//END public class Numbers