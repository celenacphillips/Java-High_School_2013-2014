//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LinearSearch extends JApplet implements ActionListener {
    JLabel enterLabel, resultLabel;
    JTextField enterField, resultField;
    int array [];

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

        array = new int [100];

        for (int counter = 0; counter < array.length; counter++)
            array [counter] = 2 * counter;
    }//END public void init ()

    public int linearSearch (int array2 [], int key) {
        for (int counter = 0; counter < array2.length; counter++)
            if (array2 [counter] == key)
                return counter;

        return -1;
    }//END public int linearSearch (int array2 [], int key)

    public void actionPerformed (ActionEvent actionEvent) {
        String searchKey = actionEvent.getActionCommand ();

        int element = linearSearch (array, Integer.parseInt (searchKey));

        if (element != -1)
            resultField.setText ("Found value in element " + element);
        else
            resultField.setText ("Value not found");
    }//END public void actionPerformed (ActionEvent actionEvent)
}//END public class LinearSearch