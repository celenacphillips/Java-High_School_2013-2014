//Celena Williams

import javax.swing.*;

public class StringBufferChars {
    public static void main (String [] args) {
        StringBuffer buffer = new StringBuffer ("hello ther");

        String output = "buffer = " + buffer.toString () +
                        "\nCharacter at 0: " + buffer.charAt (0) +
                        "\nCharacter at 4: " + buffer.charAt (4);

        char charArray [] = new char [buffer.length ()];
        buffer.getChars (0, buffer.length (), charArray, 0);
        output += "\n\nThe characters are: ";

        for (int count = 0; count < charArray.length; count++)
                output += charArray [count];

        buffer.setCharAt (0, 'H');
        buffer.setCharAt (6, 'T');
        output += "\n\nbuf = " + buffer.toString ();

        buffer.reverse ();
        output += "\n\nbuf = " + buffer.toString ();

        JOptionPane.showMessageDialog (null, output, 
                                       "StringBuffer character methods", 
                                       JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class StringBufferChars