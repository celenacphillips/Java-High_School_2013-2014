//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Verb extends JFrame implements ActionListener {
    private JTextField wordField;
    private JLabel wordLabel, outputLabel;
    private JButton convertButton;
    private JPanel northPanel, centerPanel, southPanel;
    private String verbString, verb, verbSubstring;

    public Verb () {
        super ("Checking Verbs");

        wordField = new JTextField (10);
        wordLabel = new JLabel ("Enter a verb");
        outputLabel = new JLabel ("");
        convertButton = new JButton ("Convert");
        northPanel = new JPanel ();
        centerPanel = new JPanel ();
        southPanel = new JPanel ();

        Container container = getContentPane ();
        container.setLayout (new BorderLayout ());

        container.add (northPanel, BorderLayout.NORTH);
        container.add (centerPanel, BorderLayout.CENTER);
        container.add (southPanel, BorderLayout.SOUTH);

        northPanel.add (wordLabel);
        northPanel.add (wordField);
        centerPanel.add (convertButton);
        southPanel.add (outputLabel);

        convertButton.addActionListener (this);
        wordField.addActionListener (this);

        setSize (500, 200);
        setVisible (true);
    }//END public Verb ()

    public void actionPerformed (ActionEvent e) {
        verbString = wordField.getText ();
        verbString = verbString.toLowerCase ();

        for (int i = verbString.length()-1; i > verbString.length()-2; i--) {
            if (verbString.charAt (i) == 'a' || verbString.charAt (i) == 'e' || 
                verbString.charAt (i) == 'i' || verbString.charAt (i) == 'o' || 
                verbString.charAt (i) == 'u') {
                verbSubstring = verbString.substring (0, verbString.length()-1);
                verb = verbSubstring + "ing";
            }//END if (verbString.charAt (i)...'u')
            else  if (verbString.length () == 3 || verbString.equals ("stop") ||
                      verbString.equals ("drop"))
                verb = verbString + verbString.charAt (i) + "ing";
             else
                verb = verbString + "ing";
        }//END for (int...i--)

        if (verbString.equals ("eat") || verbString.equals ("try") || 
            verbString.equals ("see") || verbString.substring(2, 3).equals("x"))
            verb = verbString + "ing";

        if (verbString.substring (1, 3).equals ("ie"))
            verb = verbString.substring (0, 1) + "ying";

        outputLabel.setText (verb);
        wordField.setText ("");
    }//END public void actionPerformed (ActionEvent e)

    public static void main (String [] args) {
        Verb application = new Verb ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class Verb