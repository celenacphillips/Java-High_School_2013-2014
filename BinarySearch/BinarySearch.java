//Celena Williams

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

public class BinarySearch extends JApplet implements ActionListener {
    JLabel enterLabel, resultLabel;
    JTextField enterField, resultField;
    JTextArea output;

    int array [];
    String display = "";

    public void init () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        enterLabel = new JLabel ("Enter integer search key");
        container.add (enterLabel);

        enterField = new JTextField (10);
        container.add (enterField);

        enterField.addActionListener (this);

        resultLabel = new JLabel ("Result");
        container.add (resultLabel);

        resultField = new JTextField (20);
        resultField.setEditable (false);
        container.add (resultField);

        output = new JTextArea (6, 60);
        output.setFont (new Font ("Monospaced", Font.PLAIN, 12));
        container.add (output);

        array = new int [15];

        for (int counter = 0; counter < array.length; counter++)
            array [counter] = 2 * counter;
    }//END public void init ()

    public void actionPerformed (ActionEvent actionEvent) {
        String searchKey = actionEvent.getActionCommand ();

        display = "Portions of array searched\n";

        int element = binarySearch (array, Integer.parseInt (searchKey));

        output.setText (display);

        if (element != -1)
            resultField.setText ("Found value in element " + element);
        else
            resultField.setText ("Value not found");
    }//END public void actionPerformed (ActionEvent actionEvent)

    public int binarySearch (int array2 [], int key) {
        int low = 0;
        int high = array2.length - 1;
        int middle;

        while (low <= high) {
            middle = (low + high) / 2;

            buildOutput (array2, low, middle, high);

            if (key == array [middle])
                return middle;
            else if (key < array [middle])
                high = middle - 1;
            else
                low = middle + 1;
        }//END while (low <= high)
        return -1;
    }//END public int binarySearch (int array2 [], int key)

    void buildOutput (int array3 [], int low, int middle, int high) {
        DecimalFormat twoDigits = new DecimalFormat ("00");

        for (int counter = 0; counter < array3.length; counter++) {
            if (counter < low || counter > high)
                    display += "     ";
            else if (counter == middle)
                display += twoDigits.format (array3 [counter]) + "* ";
            else
                display += twoDigits.format (array3 [counter]) + " ";
        }//END for (int counter = 0; counter < array3.length; counter++)
        display += "\n";
    }//END void buildOutput (int array3 [], int low, int middle, int high)
}//END public class BinarySearch