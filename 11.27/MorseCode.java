//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MorseCode extends JApplet implements ActionListener {
    JLabel inputLabel;
    JTextField inputField;
    JButton enterButton;
    JTextArea outputArea;

    public void init () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        inputLabel = new JLabel ("Enter a word");
        container.add (inputLabel);

        inputField = new JTextField (10);
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
        String Input = inputField.getText ();

        String Output = coding (Input);

outputArea.setText (Output);
    }//END public void actionPerformed (ActionEvent e)

    public String coding (String input) {
        String output = "";

        input = input.toUpperCase ();

        for (int i = 0; i < input.length (); i++) {
                char letter = input.charAt (i);

                if (letter == 'A')
                    output += ".- ";

                if (letter == 'B')
                    output += "-... ";

                if (letter == 'C')
                    output += "-.-. ";

                if (letter == 'D')
                    output += "-.. ";

                if (letter == 'E')
                    output += ". ";

                if (letter == 'F')
                    output += "..-. ";

                if (letter == 'G')
                    output += "--. ";

                if (letter == 'H')
                    output += ".... ";

                if (letter == 'I')
                    output += ".. ";

                if (letter == 'J')
                    output += ".--- ";

                if (letter == 'K')
                    output += "-.- ";

                if (letter == 'L')
                    output += ".-.. ";

                if (letter == 'M')
                    output += "-- ";

                if (letter == 'N')
                    output += "-. ";

                if (letter == 'O')
                    output += "--- ";

                if (letter == 'P')
                    output += ".--. ";

                if (letter == 'Q')
                    output += "--.- ";

                if (letter == 'R')
                    output += ".-. ";

                if (letter == 'S')
                    output += "... ";

                if (letter == 'T')
                    output += "- ";

                if (letter == 'U')
                    output += "..- ";

                if (letter == 'V')
                    output += "...- ";

                if (letter == 'W')
                    output += ".-- ";

                if (letter == 'X')
                    output += "-..- ";

                if (letter == 'Y')
                    output += "-.-- ";

                if (letter == 'Z')
                    output += "--.. ";

                if (letter == '1')
                    output += ".---- ";

                if (letter == '2')
                    output += "..--- ";

                if (letter == '3')
                    output += "...-- ";

                if (letter == '4')
                    output += "....- ";

                if (letter == '5')
                    output += "..... ";

                if (letter == '6')
                    output += "-.... ";

                if (letter == '7')
                    output += "--... ";

                if (letter == '8')
                    output += "---.. ";

                if (letter == '9')
                    output += "----. ";

                if (letter == '0')
                    output += "---- ";

                if (letter == ' ')
                    output += "   ";
        }//END for (int i = 0; i < input.length (); i++)

        return output;
    }//END public String coding (String input)
}//END public class MorseCode