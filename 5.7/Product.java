//Celena Williams

import javax.swing.JOptionPane;

public class Product {
    public static void main (String [] args) {
        int total = 1;

        for (int number = 1; number <= 15; number += 2) {
            if (number % 2 != 0)
                total = total * number;
        }//END for (int number = 1; number <= 15; number += 2)

        JOptionPane.showMessageDialog (null, "The product of all the odd " + 
                                     "integers from 1 to 15 is " + total + ".");
    }//END public static void main (String [] args)
}//END public class Product