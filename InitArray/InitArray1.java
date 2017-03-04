//Celena Williams

import javax.swing.*;

public class InitArray1 {
    public static void main (String [] args) {
        int array [] = {32, 27, 64, 18, 95, 14, 70, 60, 37};

        String output = "Index\tValue\n";

        for (int counter = 0; counter < array.length; counter++)
            output += counter + "\t" + array [counter] + "\n";

        JTextArea outputArea = new JTextArea ();
        outputArea.setText (output);

        JOptionPane.showMessageDialog (null, outputArea, 
                                       "Initializing an Array with Declaration",
                                       JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class InitArray1