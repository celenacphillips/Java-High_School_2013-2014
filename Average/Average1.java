//Celena Williams

import javax.swing.JOptionPane;

public class Average1 {
    public static void main (String [] args) {
        int total, gradeCounter, grade, average;

        String gradeString;

        total = 0;
        gradeCounter = 1;

        while (gradeCounter <= 10) {
            gradeString = JOptionPane.showInputDialog ("Enter integer grade");

            grade = Integer.parseInt (gradeString);

            total += grade;
            gradeCounter++;
        }//END while (gradeCounter <= 10)

        average = total / 10;

        JOptionPane.showMessageDialog (null, "Class average is " + average, 
                                       "Class Average", 
                                       JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class Average1