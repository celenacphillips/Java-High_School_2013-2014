//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Temp extends JFrame implements ActionListener {
    private JTextField temperatureField;
    private JLabel temperatureLabel, temperatureConversion, previousLabel;
    private JButton newButton;
    private String fahrenheitStr;
    private String output = "";
    private double fahrenheit, celsius;
    private JPanel northPanel, centerPanel, southPanel, southNorthPanel;
    private JPanel southSouthPanel;

    public Temp () {
        Container container = getContentPane ();
        container.setLayout (new BorderLayout ());

        temperatureField = new JTextField (5);
        temperatureLabel = new JLabel
         ("Enter the temperature in Fahrenheit then press Enter to convert.\n");
        temperatureConversion = new JLabel ("");
        previousLabel = new JLabel ("");
        newButton = new JButton ("New");

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
        container.add (previousLabel, BorderLayout.EAST);

        northPanel.add (temperatureLabel);
        centerPanel.add (temperatureField);
        southPanel.add (southNorthPanel, BorderLayout.NORTH);
        southPanel.add (southSouthPanel, BorderLayout.SOUTH);
        southNorthPanel.add (temperatureConversion);
        southSouthPanel.add (newButton);

        temperatureField.addActionListener (this);
        newButton.addActionListener (this);

        temperatureField.setActionCommand ("Convert");
        newButton.setActionCommand ("New");

        setSize (500, 500);
        setVisible (true);
    }//END public Temp ()

    public void actionPerformed (ActionEvent e) {
        String arg = e.getActionCommand ();

        if (arg.equals ("Convert")) {
            fahrenheitStr = temperatureField.getText ();
            fahrenheit = Double.parseDouble (fahrenheitStr);
            celsius = (5 * (fahrenheit - 32)) / 9;
            previousLabel.setText (output);
            temperatureConversion.setText (celsius + " °C");
            output += fahrenheit + " °F      ";
            temperatureLabel.setText ("Click New to try another");
            temperatureField.setEditable (false);
        }//END (arg.equals ("Convert")) 

        if (arg.equals ("New")) {
            temperatureLabel.setText
           ("Enter the temperature in Fahrenheit then press Enter to convert.");
            temperatureConversion.setText ("");
            temperatureField.setEditable (true);
            temperatureField.setText ("");
            temperatureField.requestFocus ();
        }//END if (arg.equals ("New"))
    }//END public void actionPerformed (ActionEvent e)

    public static void main (String [] args) {
        Temp application = new Temp ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args) 
}//END public class Temp