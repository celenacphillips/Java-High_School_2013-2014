//Celena Williams

import javax.swing.JOptionPane;

public class Digits {
    public static void main (String [] args) {
        String number;
        int num, product;
        String output = "";

        number = JOptionPane.showInputDialog ("Enter the size of your array");
        num = Integer.parseInt (number);

        int array [] = new int [num];

        for (int counter = 1; counter <= array.length; counter++) {
            array [counter - 1] = counter;

            output += counter;

            product = array [counter - 1] * 2;

            output += "       " + product + "\n";
        }//END for (int counter = 1; counter <= array.length; counter++)

        JOptionPane.showMessageDialog (null, output);
    }//END public static void main (String [] args)
}//END public class Digits