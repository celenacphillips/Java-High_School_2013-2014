//Celena Williams

import java.awt.Container;
import javax.swing.*;

public class PassArray extends JApplet {
    public void init () {
        JTextArea outputArea = new JTextArea ();
        Container container = getContentPane ();
        container.add (outputArea);

        int array [] = {1, 2, 3, 4, 5};

        String output = "Effects of passing entire array by refrence:\n" + 
                        "The values of the original array are:\n";

        for (int counter = 0; counter < array.length; counter++)
            output += "     " + array [counter];

        modifyArray (array);

        output += "\n\nThe values of the modified array are:\n";

        for (int counter = 0; counter < array.length; counter++)
                output += "     " + array [counter];

        output += "\n\nEffects of passing arrray element by value:\n" + 
                  "array [3] before modifyElement: " + array [3];

        modifyElement (array [3]);

        output += "\narray [3] after modifyElement: " + array [3];
        outputArea.setText (output);
    }//END public void init ()

    public void modifyArray (int array2 []) {
        for (int counter = 0; counter < array2.length; counter++)
            array2 [counter] *= 2;
    }//END public void modifyArray (int array2 [])

    public void modifyElement (int element) {
        element *= 2;
    }//END public void modifyElement (int element)
}//END public class PassArray