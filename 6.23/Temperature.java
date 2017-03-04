//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Temperature extends JApplet implements ActionListener {
    JLabel fahrenheitLabel, celsiusLabel;
    JTextField fahrenheitField, celsiusField;

    public Temperature () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        fahrenheitLabel = new JLabel ("Enter the Fahrenheit temperature");
        container.add (fahrenheitLabel);

        fahrenheitField = new JTextField (3);
        fahrenheitField.addActionListener (this);
        fahrenheitField.setActionCommand ("F");
        container.add (fahrenheitField);

        celsiusLabel = new JLabel ("Enter the Celsius temperature");
        container.add (celsiusLabel);

        celsiusField = new JTextField (3);
        celsiusField.addActionListener (this);
        celsiusField.setActionCommand ("C");
        container.add (celsiusField);
    }//END public Temperature ()

    public void actionPerformed (ActionEvent e) {
        String arg = e.getActionCommand ();

        if (arg == "F") {
            double f = Double.parseDouble (fahrenheitField.getText ());
            double Celsius = celsius (f);

            celsiusField.setText (Celsius + "");
        }//END if (arg == "F")
        else {
            double c = Double.parseDouble (celsiusField.getText ());
            double Fahrenheit = fahrenheit (c);

            fahrenheitField.setText (Fahrenheit + "");
        }//END else
    }//END public void actionPerformed (ActionEvent e)

    public double celsius (double F) {
            double C = 5.0 / 9.0 * (F - 32);

            return C;
    }//END public double celsius (double F)

    public double fahrenheit (double C) {
        double F = 9.0 / 5.0 * C + 32;

        return F;
    }//END public double fahrenheit (double C)
}//END public class Temperature