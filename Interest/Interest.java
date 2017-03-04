//Celena Williams

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interest {
    public static void main (String [] args) {
        double amount;
        double principal = 1000.0;
        double rate = 0.05;

        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance (Locale.US);

        JTextArea outputTextArea = new JTextArea ();

        outputTextArea.setText ("Year\tAmount on deposit\n");

        for (int year = 1; year <= 10; year++) {
            amount = principal * Math.pow (1.0 + rate, year);

            outputTextArea.append (year + "\t" + moneyFormat.format (amount) + 
                                   "\n");
        }//END for (int year = 1; year <= 10; year++)

        JOptionPane.showMessageDialog (null, outputTextArea, "Compand Interest",
                                       JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class Interest