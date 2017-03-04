//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TotalGrades extends JApplet implements ActionListener {
    JLabel inputLabel;
    JTextField inputField;

    public TotalGrades () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        inputLabel = new JLabel ("Input the student's average");
        container.add (inputLabel);

        inputField = new JTextField (4);
        inputField.addActionListener (this);
        container.add (inputField);
    }//END public TotalGrades ()

    public void actionPerformed (ActionEvent e) {
        int grade = Integer.parseInt (inputField.getText ());

        int output = qualityPoints (grade);

        showStatus ("The student's average is " + grade + " and their quality" +
                    " point is "+ output + ".");
    }//END public void actionPerformed (ActionEvent e)

    public int qualityPoints (int average) {
        if (average > 89)
            return 4;
        else
            if (average > 79)
                return 3;
            else
                if (average > 69)
                    return 2;
                else
                    if (average > 59)
                        return 1;
                    else
                        return 0;
    }//END public int qualityPoints (int average)
}//END public class TotalGrades