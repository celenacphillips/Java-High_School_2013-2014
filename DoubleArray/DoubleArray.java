//Celena Williams

import java.awt.*;
import javax.swing.*;

public class DoubleArray extends JApplet {
    int grades [][] = {{77, 68, 86, 73}, {96, 87, 89, 81}, {70, 90, 86, 81}};

    int students, exams;
    String output;
    JTextArea outputArea;

    public void init () {
        students = grades.length;
        exams = grades [0].length;

        outputArea = new JTextArea ();
        Container container = getContentPane ();
        container.add (outputArea);

        output = "The array is:\n";
        buildString ();

        output += "\n\nLowest grade: " + minimum () + "\nHighest grade: " + 
                  maximum () + "\n";

        for (int counter = 0; counter < students; counter++) {
            output += "\nAverage for student " + counter + " is " + 
                      average (grades [counter]);
        }//END for (int counter = 0; counter < students; counter++)

        outputArea.setFont (new Font ("Monospaced", Font.PLAIN, 12));

        outputArea.setText (output);
    }//END public void init ()

    public int minimum () {
        int lowGrade = grades [0][0];

        for (int row = 0; row < students; row++) {
            for (int column = 0; column < exams; column++) {
                if (grades [row][column] < lowGrade)
                    lowGrade = grades [row][column];
            }//END for (int column = 0; column < exams; column++)
        }//END for (int row = 0; row < students; row++)
        return lowGrade;
    }//END public int minimum ()

    public int maximum () {
        int highGrade = grades [0][0];

        for (int row = 0; row < students; row++) {
            for (int column = 0; column < exams; column++) {
                if (grades [row][column] > highGrade)
                    highGrade = grades [row][column];
            }//END for (int column = 0; column < exams; column++)
        }//END for (int row = 0; row < students; row++)
        
        return highGrade;
    }//END public int maximum ()

    public double average (int setOfGrades []) {
        int total = 0;

        for (int count = 0; count < setOfGrades.length; count++)
            total += setOfGrades [count];

        return (double) total / setOfGrades.length;
    }//END public double average (int setOfGrades [])

    public void buildString () {
        output += "            ";

        for (int counter = 0; counter < exams; counter++)
            output += "[" + counter + "]  ";


        for (int row = 0; row < students; row++) {
            output += "\ngrades[" + row + "]    ";

            for (int column = 0; column < exams; column++)
                output += grades [row][column] + "   ";
        }//END for (int row = 0; row < students; row++)
    }//END public void buildString ()
}//END public class DoubleArray