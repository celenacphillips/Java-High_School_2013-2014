//Celena Williams

import java.awt.*;
import javax.swing.*;

public class BubbleSort extends JApplet {
    public void init () {
        JTextArea outputArea = new JTextArea ();
        Container container = getContentPane ();
        container.add (outputArea);

        int array [] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};

        String output = "Data items in original order\n";

        for (int counter = 0; counter < array.length; counter++)
            output += "     " + array [counter];

        bubbleSort (array);

        output += "\n\nData items in ascending order\n";

        for (int counter = 0; counter < array.length; counter++)
            output += "     " + array [counter];

        outputArea.setText (output);
    }//END public void init ()

    public void bubbleSort (int array2 []) {
        for (int pass = 1; pass < array2.length; pass++) {
            for (int element = 0; element < array2.length - 1; element++) {
                if (array2 [element] > array2 [element + 1])
                    swap (array2, element, element + 1);
            }//END for (int element = 0; element < array2.length - 1; element++)
        }//END for (int pass = 1; pass < array2.length; pass++)
    }//END public void bubbleSort (int array2 [])

    public void swap (int array3 [], int first, int second) {
        int hold;

        hold = array3 [first];
        array3 [first] = array3 [second];
        array3 [second] = hold;
    }//END public void swap (int array3 [], int first, int second)
}//END public class BubbleSort