//Celena Williams

import javax.swing.JOptionPane;

public class Cast1 {
    public static void main (String [] args) {
        String string1;

        char char1;

        string1 = JOptionPane.showInputDialog
       ("Enter a character, upper- or lowercase\nThe values are all different");

        char1 = string1.charAt (0);

        JOptionPane.showMessageDialog (null, "The character " + char1 + 
                                       " has the value of " + (int) char1);
    }//END public static void main (String [] args)
}//END public class Cast1