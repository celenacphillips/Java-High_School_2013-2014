//Celena Williams

import javax.swing.JOptionPane;

public class Student2 {
    public static void main (String [] args) {
        String programmingTwoClass [] = new String [12];
        String output = "Programming II Class\n\n";

        for (int counter = 0; counter < programmingTwoClass.length; counter++) {
            programmingTwoClass [counter] = JOptionPane.showInputDialog
                                                         ("Enter student name");
            output += programmingTwoClass [counter] + "\n";
        }//END for (int...counter++)

        JOptionPane.showMessageDialog (null, output);
    }//END public static void main (String [] args)
}//END public class Student2