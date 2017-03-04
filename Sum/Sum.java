//Celena Williams

import javax.swing.JOptionPane;

public class Sum {
    public static void main (String [] args) {
        int total = 0;
        for (int number = 2; number <= 100; number += 2)
            total += number;

        JOptionPane.showMessageDialog (null, "The sum is " + total, 
                                       "Total Even Integers from 2 to 100", 
                                       JOptionPane.INFORMATION_MESSAGE);
        System.exit (0);
    }//END public static void main (String [] args)
}//END public class Sum