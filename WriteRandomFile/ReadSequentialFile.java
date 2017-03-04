//Celena Williams

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Bank.*;

public class ReadSequentialFile extends JFrame {
    private ObjectInputStream input;
    private BankUI userInterface;
    private JButton nextButton, openButton;

    public ReadSequentialFile () {
        super ("Reading a Sequential File of Objects");

        userInterface = new BankUI (4);
        getContentPane ().add (userInterface, BorderLayout.CENTER);

        openButton = userInterface.getDoTask1Button ();
        openButton.setText ("Open File");

        openButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    openFile ();
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END openButton.addActionListener

        addWindowListener (
            new WindowAdapter () {
                public void windowClosing (WindowEvent event) {
                    if (input != null)
                        closeFile ();

                    System.exit (0);
                }//END public void windowClosing (WindowEvent event)
            }//END new WindowAdapter ()
        );//END addWindowListener 

        nextButton = userInterface.getDoTask2Button ();
        nextButton.setText ("Next Record");
        nextButton.setEnabled (false);

        nextButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    readRecord ();
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END nextButton.addActionListener

        pack ();
        setSize (300, 200);
        setVisible (true);
    }//END public ReadSequentialFile ()

    private void openFile () {
        JFileChooser fileChooser = new JFileChooser ();
        fileChooser.setFileSelectionMode (JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog (this);

        if (result == JFileChooser.CANCEL_OPTION)
                return;

        File fileName = fileChooser.getSelectedFile ();

        if (fileName == null || fileName.getName ().equals (""))
            JOptionPane.showMessageDialog (this, "Invalid File Name", 
                                           "Invalid File Name", 
                                           JOptionPane.ERROR_MESSAGE);
        else {
            try {
                input = new ObjectInputStream (new FileInputStream (fileName));

                openButton.setEnabled (false);
                nextButton.setEnabled (true);
            }//END try
            catch (IOException ioException) {
                JOptionPane.showMessageDialog (this, "Error Opening File", 
                                               "Error", 
                                               JOptionPane.ERROR_MESSAGE);
            }//END catch (IOException ioException)
        }//END else
    }//END private void openFile ()

    public void readRecord () {
        AccountRecord record;

        try {
            record = (AccountRecord) input.readObject ();

            String values [] = {String.valueOf (record.getAccount ()), 
                                record.getFirstName (), record.getLastName (), 
                                String.valueOf (record.getBalance ())};

            userInterface.setFieldValues (values);
        }//END try
        catch (EOFException endOfFileException) {
            nextButton.setEnabled (false);

            JOptionPane.showMessageDialog (this, "No more records in file", 
                                           "End of File", 
                                           JOptionPane.ERROR_MESSAGE);
        }//END catch (EOFException endOfFileException)
        catch (ClassNotFoundException classNotFoundException) {
            JOptionPane.showMessageDialog (this, "Unable to create object", 
                                           "Class Not Found", 
                                           JOptionPane.ERROR_MESSAGE);
        }//END catch (ClassNotFoundException classNotFoundException)
        catch (IOException ioException) {
            JOptionPane.showMessageDialog (this, "Error during read from file", 
                                           "Read Error", 
                                           JOptionPane.ERROR_MESSAGE);
        }//END catch (IOException ioException)
    }//END public void readRecord ()

    private void closeFile () {
        try {
            input.close ();
            System.exit (0);
        }//END try
        catch (IOException ioException) {
            JOptionPane.showMessageDialog (this, "Error closing file", "Error", 
                                           JOptionPane.ERROR_MESSAGE);

            System.exit (1);
        }//END catch (IOException ioException)
    }//END private void closeFile ()

    public static void main (String [] args) {
        new ReadSequentialFile ();
    }//END public static void main (String [] args)
}//END public class ReadSequentialFile