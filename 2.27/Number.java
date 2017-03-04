//Celena Williams

import javax.swing.JOptionPane;

public class Number {
    public static void main (String [] args) {
        String number;

        int num;

        number = JOptionPane.showInputDialog ("Enter integer");

        num = Integer.parseInt (number);



        if (num % 2 == 0)
            JOptionPane.showMessageDialog (null, "The number is even");
        else
            if (num % 2 != 0)
                JOptionPane.showMessageDialog (null, "The number is odd");
    }//END public static void main (String [] args)
}//END public class Number