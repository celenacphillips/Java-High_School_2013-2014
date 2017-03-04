//Celena Williams

import javax.swing.JOptionPane;

public class Analysis {
    public static void main (String [] args) {
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result;

        String input, output;

        while (studentCounter <= 10) {
            input = JOptionPane.showInputDialog
                                          ("Enter result (1 = pass, 2 = fail)");

            result = Integer.parseInt (input);

            if (result == 1)
                passes++;
            else
                failures++;

            studentCounter++;
        }//END while (studentCounter <= 10)

        output = "Passed: " + passes + "\nFailed: " + failures;

        if (passes > 8)
            output += "\nRaise Tuition";

        JOptionPane.showMessageDialog (null, output,
                                       "Analysis of Examination Results", 
                                       JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class Analysis