//Celena Williams

import javax.swing.*;

public class StringBufferConstructors {
    public static void main (String [] args) {
        StringBuffer buffer1 = new StringBuffer ();
        StringBuffer buffer2 = new StringBuffer (10);
        StringBuffer buffer3 = new StringBuffer ("hello");

        String output = "buffer1 = \"" + buffer1.toString () + "\"" +
                        "\nbuffer2 = \"" + buffer2.toString () + "\"" +
                        "\nbuffer3 = \"" + buffer3.toString () + "\"";

        JOptionPane.showMessageDialog (null,output, "StringBuffer constructors",
                                       JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class StringBufferConstructors