//Celena Williams

import javax.swing.*;

public class StringBufferAppend {
    public static void main (String [] args) {
        Object objectRef = "hello";
        String string = "goodbye";
        char charArray [] = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        StringBuffer lastBuffer = new StringBuffer ("last StringBuffer");
        StringBuffer buffer = new StringBuffer ();

        buffer.append (objectRef);
        buffer.append ("  ");
        buffer.append (string);
        buffer.append ("  ");
        buffer.append (charArray);
        buffer.append ("  ");
        buffer.append (charArray, 0, 3);
        buffer.append ("  ");
        buffer.append (booleanValue);
        buffer.append ("  ");
        buffer.append (characterValue);
        buffer.append ("  ");
        buffer.append (integerValue);
        buffer.append ("  ");
        buffer.append (longValue);
        buffer.append ("  ");
        buffer.append (floatValue);
        buffer.append ("  ");
        buffer.append (doubleValue);
        buffer.append ("  ");
        buffer.append (lastBuffer);

        JOptionPane.showMessageDialog (null, "buffer = " + buffer.toString (), 
                                       "StringBuffer append Methods", 
                                       JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class StringBufferAppend