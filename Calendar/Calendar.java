//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calendar extends JApplet implements ActionListener {
    Choice monthsChoice;
    Button viewButton;
    TextArea outputArea;

    public void init () {
        Container container = getContentPane ();
        container.setLayout (new GridLayout (4, 6));

        monthsChoice = new Choice ();
        container.add (monthsChoice);

        monthsChoice.add ("Select a month...");
        monthsChoice.add ("January");
        monthsChoice.add ("February");
        monthsChoice.add ("March");
        monthsChoice.add ("April");
        monthsChoice.add ("May");
        monthsChoice.add ("June");
        monthsChoice.add ("July");
        monthsChoice.add ("August");
        monthsChoice.add ("September");
        monthsChoice.add ("October");
        monthsChoice.add ("November");
        monthsChoice.add ("December");

        viewButton = new Button ("View");
        viewButton.addActionListener (this);
        container.add (viewButton);

        outputArea = new TextArea ("", 10 , 100 , 
                                             TextArea.SCROLLBARS_VERTICAL_ONLY);
        outputArea.setEditable (false);
        container.add (outputArea);
    }//END public void init ()

    public void actionPerformed (ActionEvent e) {
        String text = "";

        if (monthsChoice.getSelectedIndex () == 0)
            text = "Please select a month...";

        if (monthsChoice.getSelectedIndex () == 1)
            text = "January\n\n\tIn January...";

        if (monthsChoice.getSelectedIndex () == 2)
            text = "February\n\n\tIn Febraury...";

        if (monthsChoice.getSelectedIndex () == 3)
            text = "March\n\n\tIn March...";

        if (monthsChoice.getSelectedIndex () == 4)
            text = "April\n\n\tIn April...";

        if (monthsChoice.getSelectedIndex () == 5)
            text = "May\n\n\tIn May...";

        if (monthsChoice.getSelectedIndex () == 6)
            text = "June\n\n\tIn June...";

        if (monthsChoice.getSelectedIndex () == 7)
            text = "July\n\n\tIn July...";

        if (monthsChoice.getSelectedIndex () == 8)
            text = "August\n\n\tIn August...";

        if (monthsChoice.getSelectedIndex () == 9)
            text = "September\n\n\tIn September...";

        if (monthsChoice.getSelectedIndex () == 10)
            text = "October\n\n\tIn October...";

        if (monthsChoice.getSelectedIndex () == 11)
            text = "Novemeber\n\n\tIn November...";

        if (monthsChoice.getSelectedIndex () == 12)
            text = "December\n\n\tIn December...";

        outputArea.setText (text);
    }//END public void actionPerformed (ActionEvent e)
}//END public class Calendar