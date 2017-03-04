//Celena Williams

import javax.swing.*;

public class InitArray {
    public static void main (String [] args) {
        int array [];
        array = new int [10];

        String output = "Index\tValue\n";

        for (int counter = 0; counter < array.length; counter++)
            output += counter + "\t" + array [counter] + "\n";

        JTextArea outputArea = new JTextArea ();
        outputArea.setText (output);

        JOptionPane.showMessageDialog (null, outputArea,
                                       "Initializing an Array of int Values", 
                                       JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class InitArray