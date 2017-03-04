//Celena Williams

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Average2 {
    public static void main (String [] args) {
        int total = 0, gradeCounter = 0, grade;
        double average;
        String gradeString;

        gradeString = JOptionPane.showInputDialog
                                          ("Enter Integer Grade or -1 to Quit");

        grade = Integer.parseInt (gradeString);

        while (grade != -1) {
            total += grade;
            gradeCounter++;

            gradeString = JOptionPane.showInputDialog
                                          ("Enter Integer Grade or -1 to Quit");

            grade = Integer.parseInt (gradeString);
        }//END while (grade != -1)

        DecimalFormat twoDigits = new DecimalFormat ("0.00");

        if (gradeCounter != 0) {
            average = (double) total / gradeCounter;

            JOptionPane.showMessageDialog (null, "Class average is " + 
                                           twoDigits.format (average), 
                                           "Class Average", 
                                           JOptionPane.INFORMATION_MESSAGE);
        }//END if (gradeCounter != 0)
        else
            JOptionPane.showMessageDialog (null, "No grades were entered", 
                                           "Class Average", 
                                           JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class Average2