//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Parking extends JApplet implements ActionListener {
    JLabel inputLabel, outputLabel1, outputLabel2;
    JTextField inputField;
    JButton calculateButton;

    double totalHours = 0;
    double totalCharges = 0;

    NumberFormat moneyFormat = NumberFormat.getCurrencyInstance (Locale.US);

    public void init () {
            Container container = getContentPane ();
            container.setLayout (new FlowLayout ());

            inputLabel = new JLabel ("Input the Number of Hours");
            container.add (inputLabel);

            inputField = new JTextField (4);
            container.add (inputField);

            calculateButton = new JButton ("Calculate");
            calculateButton.addActionListener (this);
            container.add (calculateButton);

            outputLabel1 = new JLabel ("");
            container.add (outputLabel1);

            outputLabel2 = new JLabel ("");
            container.add (outputLabel2);
    }//END public void init ()

    public void actionPerformed (ActionEvent e) {
        double Hours = Double.parseDouble (inputField.getText ());

        double Charge = calculateCharges (Hours);

        totalHours += Hours;
        totalCharges += Charge;

        if ((Hours * 10) % 10 == 0) {
            if (Hours == 1)
                outputLabel1.setText ("For parking " + (int) Hours +
                                      " hour, the charge is " + 
                                      moneyFormat.format (Charge) + ".");
            else
                outputLabel1.setText ("For parking " + (int) Hours + 
                                      " hours, the charge is " + 
                                      moneyFormat.format (Charge) + ".");
        }//END if ((Hours * 10) % 10 == 0)

        if ((totalHours * 10) % 10 == 0) {
            if (totalHours == 1)
                outputLabel2.setText ("The total hours parked is " + (int) 
                                      totalHours + " hour and the total " + 
                                      "charges are " + moneyFormat.format 
                                      (totalCharges) + ".");
            else
                outputLabel2.setText ("The total hours parked are " + (int) 
                                      totalHours + " hours and the total " + 
                                      "charges are " + moneyFormat.format 
                                      (totalCharges) + ".");
        }//END if ((totalHours * 10) % 10 == 0)

        if ((Hours * 10) % 10 != 0) {
            if (Hours == 1)
               outputLabel1.setText ("For parking " + Hours + " hour, the " +
                                     "charge is " + moneyFormat.format (Charge) 
                                   + ".");
            else
                outputLabel1.setText ("For parking " + Hours + " hours, the " + 
                                      "charge is " + moneyFormat.format (Charge)
                                    + ".");
        }//END if ((Hours * 10) % 10 != 0)

        if ((totalHours * 10) % 10 != 0) {
            if (totalHours == 1)
                outputLabel2.setText ("The total hours parked is " + totalHours 
                                    + " hour and the total charges are " + 
                                      moneyFormat.format (totalCharges) + ".");
            else
                outputLabel2.setText ("The total hours parked are " + totalHours
                                    + " hours and the total charges are " + 
                                      moneyFormat.format (totalCharges) + ".");
        }//END if ((totalHours * 10) % 10 != 0)
    }//END public void actionPerformed (ActionEvent e)

    public double calculateCharges (double hours) {
        double charge;

        if (hours <= 3)
            charge = 2.00;
        else
            charge = 2.00 + ((hours - 3) * 0.50);

        if (hours >= 24)
            charge = 10.00;

        charge = Math.floor (charge * 100 + 0.5) / 100;

        return charge;
    }//END public double calculateCharges (double hours)
}//END public class Parking 