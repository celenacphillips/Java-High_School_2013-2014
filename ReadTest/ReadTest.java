//Celena Williams

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class ReadTest extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton displayButton;
    private JPanel northPanel;
    private JTextArea outputArea;

    public ReadTest () {
        super ("ReadFile");

        Container container = getContentPane ();
        container.setLayout (new BorderLayout ());

        inputField = new JTextField (20);
        displayButton = new JButton ("Display");
        displayButton.addActionListener (this);
        outputArea = new JTextArea ();

        JScrollPane scrollPane = new JScrollPane ();
        scrollPane.add (outputArea);

        northPanel = new JPanel ();
        northPanel.setLayout (new BorderLayout ());

        container.add (northPanel, BorderLayout.NORTH);
        container.add (scrollPane, BorderLayout.SOUTH);

        northPanel.add (inputField, BorderLayout.NORTH);
        northPanel.add (displayButton, BorderLayout.SOUTH);

        setSize (500, 500);
        setVisible (true);
    }//END public ReadTest ()

    public void actionPerformed (ActionEvent e) {
        File name = new File (e.getActionCommand ());

        if (name.isDirectory ()) {
            String directory [] = name.list ();

            outputArea.append ("\n\nDirectory contents:\n");

            for (int i = 0; i < directory.length; i++)
                outputArea.append (directory [i] + "\n");
        }//END if (name.isDirectory ())
    }//END public void actionPerformed (ActionEvent e)

    public static void main (String [] args) {
        ReadTest application = new ReadTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class ReadTest