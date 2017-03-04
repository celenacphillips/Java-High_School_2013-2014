//Celena Williams

import javax.swing.JOptionPane;

public class Larger {
    public static void main (String [] args) {
        String firstNumber, secondNumber;

        int num1, num2;

        firstNumber = JOptionPane.showInputDialog ("Enter first integer");
        secondNumber = JOptionPane.showInputDialog ("Enter second integer");

        num1 = Integer.parseInt (firstNumber);
        num2 = Integer.parseInt (secondNumber);

        if (num1 > num2)
            JOptionPane.showMessageDialog (null, num1 + " is larger", "Results",
                                           JOptionPane.INFORMATION_MESSAGE);
        else if (num1 < num2)
            JOptionPane.showMessageDialog (null, num2 + " is larger", "Results",
                                           JOptionPane.INFORMATION_MESSAGE);
        else if (num1 == num2)
            JOptionPane.showMessageDialog (null, "These numbers are equal.",
                                    "Results", JOptionPane.INFORMATION_MESSAGE);
    }//END public static void main (String [] args)
}//END public class Larger