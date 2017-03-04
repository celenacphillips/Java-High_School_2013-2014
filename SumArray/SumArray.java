//Celena Williams

import javax.swing.*;

public class SumArray {
    public static void main (String [] args) {
        int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++)
            total += array [counter];

        JOptionPane.showMessageDialog (null,"Total of array elements: " + total,
                                       "Sum of the Elements of an Array",
                                       JOptionPane.INFORMATION_MESSAGE);
        System.exit (0);
    }//END public static void main (String [] args)
}//END public class SumArray