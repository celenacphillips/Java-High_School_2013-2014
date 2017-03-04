//Celena Williams

import javax.swing.JOptionPane;

public class RandomIntegers {
    static int value;
    static String output = "";

    public static void main (String [] args) {
        random ();
        System.exit (0);
    }//END public static void main (String [] args)

    public static void random () {
        for (int counter = 1; counter <= 20; counter++) {
            value = 1 + (int) (Math.random () * 6);

            output += value + "   ";

            if (counter % 5 == 0)
                output += "\n";
        }//END for (int counter = 1; counter <= 20; counter++)

        JOptionPane.showMessageDialog (null, output, 
                                       "20 Random Numbers from 1 to 6", 
                                       JOptionPane.INFORMATION_MESSAGE);
    }//END public static void random ()
}//END public class RandomIntegers