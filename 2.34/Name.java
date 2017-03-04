//Celena Williams

import javax.swing.JOptionPane;

public class Name {
    public static void main (String [] args) {
        String firstName, lastName;

        firstName = JOptionPane.showInputDialog ("First Name:");
        lastName = JOptionPane.showInputDialog ("Last Name:");

        JOptionPane.showMessageDialog (null, firstName + " " + lastName);
    }//END public static void main (String [] args)
}//END public class Name