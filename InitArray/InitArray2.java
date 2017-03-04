//Celena Williams

import javax.swing.*;

public class InitArray2 {
    public static void main (String [] args) {
        final int ARRAY_LENGTH = 10;
        int array [];
        array = new int [ARRAY_LENGTH];

        for (int counter = 0; counter < array.length; counter++)
            array [counter] = 2 + 2 * counter;

        String output = "Index\tValue\n";

        for (int counter = 0; counter < array.length; counter++)
            output += counter + "\t" + array [counter] + "\n";

        JTextArea outputArea = new JTextArea ();
        outputArea.setText (output);

        JOptionPane.showMessageDialog (null, outputArea, 
                                    "Initializing to Even Numbers from 2 to 20", 
                                    JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class InitArray2