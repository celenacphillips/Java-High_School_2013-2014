//Celena Williams

import javax.swing.*;

public class OtherCharMethods {
    public static void main (String [] args) {
        Character c1 = new Character ('A');
        Character c2 = new Character ('a');

        String output = "c1 = " + c1.charValue () + "\nc2 = " + c2.toString ();

        if (c1.equals (c2))
            output += "\n\nc1 and c2 are equal";
        else
            output += "\n\nc1 and c2 are not equal";

        JOptionPane.showMessageDialog (null, output,
                                       "Non-static Character Methods", 
                                       JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class OtherCharMethods