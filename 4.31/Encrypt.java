//Celena Williams

import javax.swing.JOptionPane;

public class Encrypt {
    public static void main (String [] args) {
        String number;

        int num, minusThousands, minusHundreds, thousands, hundreds, tens, ones;
        int newThousands, newHundreds, newTens, newOnes;
        int firstDigit, secondDigit, thirdDigit, fourthDigit;
        int newNumber;

        number = JOptionPane.showInputDialog ("Enter four digit integer");
        num = Integer.parseInt (number);

        minusThousands = num % 1000;
        minusHundreds = minusThousands % 100;

        thousands = num / 1000;
        hundreds = minusThousands / 100;
        tens = minusHundreds / 10;
        ones = minusHundreds % 10;

        newThousands = (thousands + 7) % 10;
        newHundreds = (hundreds + 7) % 10;
        newTens = (tens + 7) % 10;
        newOnes = (ones + 7) % 10;

        firstDigit = newTens * 1000;
        secondDigit = newOnes * 100;
        thirdDigit = newThousands * 10;
        fourthDigit = newHundreds * 1;

        newNumber = firstDigit + secondDigit + thirdDigit + fourthDigit;

        if (newNumber >= 1000)
            JOptionPane.showMessageDialog (null, "The encrypted number is\n\n" +
                                           newNumber);
        else
            JOptionPane.showMessageDialog (null, "The encrypted number is\n\n0" 
                                         + newNumber);
    }//END public static void main (String [] args)
}//END public class Encrypt