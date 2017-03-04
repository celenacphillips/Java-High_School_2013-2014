//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuessingGame extends JFrame implements ActionListener {
    private int randomNumber, guess;
    private int counter = 0;
    private String guessStr;
    private JLabel messageOneLabel1, messageOneLabel2, messageOneLabel3;
    private JLabel messageTwoLabel;
    private JTextField numberField;
    private JButton newButton;
    private JPanel northPanel, centerPanel, southPanel, southNorthPanel;
    private JPanel southSouthPanel;

    public GuessingGame () {
        Container container = getContentPane ();
        container.setLayout (new BorderLayout ());

        messageOneLabel1 = new JLabel ("I have a number between 1 and 1000.");
        messageOneLabel2 = new JLabel ("Can you guess my number?");
        messageOneLabel3 = new JLabel ("Please enter your first guess.");
        messageTwoLabel = new JLabel ("");
        newButton = new JButton ("New Game");
        numberField = new JTextField (5);

        northPanel = new JPanel ();
        centerPanel = new JPanel ();
        southPanel = new JPanel ();
        southNorthPanel = new JPanel ();
        southSouthPanel = new JPanel ();

        northPanel.setLayout (new FlowLayout ());
        centerPanel.setLayout (new FlowLayout ());
        southPanel.setLayout (new BorderLayout());
        southNorthPanel.setLayout (new FlowLayout ());
        southSouthPanel.setLayout (new FlowLayout ());

        container.add (northPanel, BorderLayout.NORTH);
        container.add (centerPanel, BorderLayout.CENTER);
        container.add (southPanel, BorderLayout.SOUTH);

        northPanel.add (messageOneLabel1);
        northPanel.add (messageOneLabel2);
        northPanel.add (messageOneLabel3);
        centerPanel.add (numberField);
        southPanel.add (southNorthPanel, BorderLayout.NORTH);
        southPanel.add (southSouthPanel, BorderLayout.SOUTH);
        southNorthPanel.add (messageTwoLabel);
        southSouthPanel.add (newButton);

        numberField.addActionListener (this);
        newButton.addActionListener (this);

        numberField.setActionCommand ("Number");
        newButton.setActionCommand ("New");

        randomNumber = (int) (Math.random () * (1000));

        setSize (500, 500);
        setVisible (true);
    }//END public GuessingGame ()

    public void actionPerformed (ActionEvent e) {
        String arg = e.getActionCommand ();

        if (arg.equals ("Number")) {
            guessStr = numberField.getText ();
            guess = Integer.parseInt (guessStr);

            if (guess > randomNumber) {
                messageTwoLabel.setText ("Too high");
                counter++;
            }//END if (guess > randomNumber)
            else if (guess < randomNumber) {
                messageTwoLabel.setText ("Too low");
                counter++;
            }//END if (guess < randomNumber)
            else {
                counter++;
                messageTwoLabel.setText ("Correct!   It took you " + counter + 
                                         " tries.");
                numberField.setEditable (false);
            }//END else

            if (guess >= (randomNumber - 10) && guess <= (randomNumber + 10))
                numberField.setBackground (Color.RED);
            else
                numberField.setBackground (Color.CYAN);

            if (guess == randomNumber)
                numberField.setBackground (Color.WHITE);

        }//END if (arg.equals ("Number"))

        if (arg.equals ("New")) {
            randomNumber = (int) (Math.random () * (1000));
            messageTwoLabel.setText ("");
            numberField.setEditable (true);
            numberField.setText ("");
            numberField.requestFocus ();
        }//END if (arg.equals ("New"))
    }//END public void actionPerformed (ActionEvent e)

    public static void main (String [] args) {
        GuessingGame application = new GuessingGame ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class GuessingGame