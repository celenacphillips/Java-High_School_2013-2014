//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AgeCalculator extends JApplet implements ActionListener {
    JLabel explanationLabel1, explanationLabel2, explanationLabel3, inputLabel;
    JTextField inputField;
    JButton enterButton;
    JTextArea outputArea;

    public void init () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        explanationLabel1 = new JLabel
                                 ("This program calculates your age in years,");
        explanationLabel2 = new JLabel 
                                  ("weeks, days, hours, minutes, and seconds.");
        explanationLabel3 = new JLabel
     ("And the type of rock music was popular in the decade you were born in.");
        container.add (explanationLabel1);
        container.add (explanationLabel2);
        container.add (explanationLabel3);

        inputLabel = new JLabel ("Enter your year of birth");
        container.add (inputLabel);

        inputField = new JTextField (4);
        inputField.addActionListener (this);
        container.add (inputField);

        enterButton = new JButton ("Enter");
        enterButton.addActionListener (this);
        container.add (enterButton);

        outputArea = new JTextArea ("");
        outputArea.setEditable (false);
        container.add (outputArea);
    }//END public void init ()

    public void actionPerformed (ActionEvent e) {
        int year = Integer.parseInt (inputField.getText ());
        String output = Age (year);
        String outtext = Music (year, output);

        outputArea.setText (outtext);
        inputField.setText ("");
    }//END public void actionPerformed (ActionEvent e)

    public String Age (int Y) {
        int years, weeks;
        double days, hours, minutes, seconds;
        String output;

        years = 2013 - Y;
        weeks = years * 52;
        days = years * 365.25;
        hours = days * 24;
        minutes = hours * 60;
        seconds = minutes * 60;

        output = "Being born in " + Y + " means you are " + years + 
                 " years old, more or less.\n" +
                 "You have been through " + weeks + " weeks, approximately.\n" +
                 "You have been through " + days + " days, approximately.\n" +
                 "You have been through " + hours + " hours, approximately.\n" +
                 "You have been through " + minutes + " minutes, approximately."
               + "\nYou have been through " + seconds + " seconds," + 
                 " approximately.\n\n";

        return output;
    }//END public String Age (int Y)

    public String Music (int Y, String out) {
        if (Y >= 2000)
            out += "You were born in the time of New Age music.";
        else if (Y >= 1990)
            out += "You were born in the time of Grunge and Post-Grunge.";
        else if (Y >= 1980)
            out += "You were born in the time of Hair Metal and Thrash Metal.";
        else if (Y >= 1970)
            out += "You were born in the time of Glam Rock, and Punk Rock.";
        else if (Y >= 1960)
            out += "You were born in the time of Psychedelic Rock.";
        else if (Y >= 1950)
            out += "You were born in the time of Rockabilly.";
        
        return out;
    }//END public String Music (int Y, String out)
}//END public class AgeCalculator