//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hangman extends JApplet implements ActionListener {
    JLabel wordLabel1, wordLabel2, wordLabel3, wordLabel4, wordLabel5;
    JLabel wordLabel6, wordLabel7, wrongLabel;
    JButton answerButton;
    JTextField inputField;
    JPanel centerPanel, southPanel;

    String word = "PROGRAM";
    String wrong = "";

    public void init () {
        Container container = getContentPane ();
        container.setLayout (new BorderLayout ());

        centerPanel = new JPanel();
        centerPanel.setLayout (new FlowLayout ());
        container.add (centerPanel, BorderLayout.CENTER);

        wordLabel1 = new JLabel ("_ ");
        centerPanel.add (wordLabel1);

        wordLabel2 = new JLabel ("_ ");
        centerPanel.add (wordLabel2);

        wordLabel3 = new JLabel ("_ ");
        centerPanel.add (wordLabel3);

        wordLabel4 = new JLabel ("_ ");
        centerPanel.add (wordLabel4);

        wordLabel5 = new JLabel ("_ ");
        centerPanel.add (wordLabel5);

        wordLabel6 = new JLabel ("_ ");
        centerPanel.add (wordLabel6);

        wordLabel7 = new JLabel ("_");
        centerPanel.add (wordLabel7);

        southPanel = new JPanel();
        southPanel.setLayout (new BorderLayout ());
        container.add (southPanel, BorderLayout.SOUTH);


        inputField = new JTextField (10);
        inputField.addActionListener (this);
        southPanel.add (inputField, BorderLayout.NORTH);

        answerButton = new JButton ("Answer");
        answerButton.addActionListener (this);
        southPanel.add (answerButton, BorderLayout.SOUTH);

    wrongLabel = new JLabel ("Wrong:  ");
        container.add (wrongLabel, BorderLayout.EAST);
    }//END public void init ()

    public void actionPerformed (ActionEvent e) {
        String word = inputField.getText ();

        word = word.toUpperCase ();

        for (int i = 0; i < word.length (); i++) {
            char letter = word.charAt (i);

            if (letter == 'A')
                wordLabel6.setText (letter + "");

            if (letter == 'B')
                wrong += letter + "   ";

            if (letter == 'C')
                wrong += letter + "   ";

            if (letter == 'D')
                wrong += letter + "   ";

            if (letter == 'E')
                wrong += letter + "   ";

            if (letter == 'F')
                wrong += letter + "   ";

            if (letter == 'G')
                wordLabel4.setText (letter + "");

            if (letter == 'H')
                wrong += letter + "   ";

            if (letter == 'I')
                wrong += letter + "   ";

            if (letter == 'J')
                wrong += letter + "   ";

            if (letter == 'K')
                wrong += letter + "   ";

            if (letter == 'L')
                wrong += letter + "   ";

            if (letter == 'M')
                wordLabel7.setText (letter + "");

            if (letter == 'N')
                wrong += letter + "   ";

            if (letter == 'O')
                wordLabel3.setText (letter + "");

            if (letter == 'P')
                wordLabel1.setText (letter + "");

            if (letter == 'Q')
                wrong += letter + "   ";

            if (letter == 'R') {
                wordLabel2.setText (letter + "");
                wordLabel5.setText (letter + "");
            }//END if (letter == 'R')

            if (letter == 'S')
                wrong += letter + "   ";

            if (letter == 'T')
                wrong += letter + "   ";

            if (letter == 'U')
                wrong += letter + "   ";

            if (letter == 'V')
                wrong += letter + "   ";

            if (letter == 'W')
                wrong += letter + "   ";

            if (letter == 'X')
                wrong += letter + "   ";

            if (letter == 'Y')
                wrong += letter + "   ";

            if (letter == 'Z')
                wrong += letter + "   ";
        }//END for (int i = 0; i < word.length (); i++)

    wrongLabel.setText ("Wrong:  " + wrong);
        inputField.setText ("");
        inputField.requestFocus ();
    }//ENd public void actionPerformed (ActionEvent e)
}//END public class Hangman