import javax.swing.JOptionPane;

public class CastOpposite {
    public static void main (String [] args) {
        String string1;

        int int1;

        string1 = JOptionPane.showInputDialog 
                                       ("Enter a number to find the character");
        int1 = Integer.parseInt (string1);

        JOptionPane.showMessageDialog (null, "The number " + int1 + 
                                       " has the character of " + (char) int1);
    }//END public static void main (String [] args)
}//END public class CastOpposite