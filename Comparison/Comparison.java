//Celena Williams

import javax.swing.JOptionPane;

public class Comparison {
    public static void main (String [] args) {
        String firstNumber;
        String secondNumber;
        String result;

        int number1;
        int number2;

        firstNumber = JOptionPane.showInputDialog ("Enter first integer:");
        secondNumber = JOptionPane.showInputDialog ("Enter second integer:");

        number1 = Integer.parseInt (firstNumber);
        number2 = Integer.parseInt (secondNumber);

        result = "";

        if (number1 == number2)
            result = result + number1 + " == " + number2;

        if (number1 != number2)
            result = result + number1 + " != " + number2;

        if (number1 < number2)
            result = result + "\n" + number1 + " < " + number2;

        if (number1 > number2)
            result = result + "\n" + number1 + " > " + number2;

        if (number1 <= number2)
            result = result + "\n" + number1 + " <= " + number2;

        if (number1 >= number2)
            result = result + "\n" + number1 + " >= " + number2;

        JOptionPane.showMessageDialog (null, result, "Comparison Results",
                                       JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class Comparison