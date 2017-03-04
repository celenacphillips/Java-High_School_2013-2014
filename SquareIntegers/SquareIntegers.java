//Celena Williams

import java.awt.Container;
import javax.swing.*;

public class SquareIntegers extends JApplet {
    public void init () {
        JTextArea outputArea = new JTextArea ();

        Container container = getContentPane ();

        container.add (outputArea);

        int result;
        String output = "";

        for (int counter = 1; counter <= 10; counter++) {
            result = square (counter);
            output += "The square of " + counter + " is " + result + "\n";
        }//END for (int counter = 1; counter <= 10; counter++)

        outputArea.setText (output);
    }//END public void init ()

    public int square (int y) {
        return y * y;
    }//END public int square (int y)
}//END public class SquareIntegers