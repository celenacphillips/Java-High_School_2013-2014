//Celena Williams

import java.awt.Container;
import javax.swing.*;

public class MaximumTest extends JApplet {
    public void init () {
        String s1 = JOptionPane.showInputDialog
                                           ("Enter first floating-point value");
        String s2 = JOptionPane.showInputDialog
                                          ("Enter second floating-point value");
        String s3 = JOptionPane.showInputDialog
                                           ("Enter third floating-point value");

        double number1 = Double.parseDouble (s1);
        double number2 = Double.parseDouble (s2);
        double number3 = Double.parseDouble (s3);

        double max = maximum (number1, number2, number3);

        JTextArea outputArea = new JTextArea ();

        outputArea.setText ("number1: " + number1 + "\nnumber2: " + number2 + 
                            "\nnumber3: " + number3 + "\nmaximum is: " + max);

        Container container = getContentPane ();

        container.add (outputArea);
    }//END public void init ()

    public double maximum (double x, double y, double z) {
        return Math.max (x, Math.max (y, z));
    }//END public double maximum (double x, double y, double z)
}//END public class MaximumTest