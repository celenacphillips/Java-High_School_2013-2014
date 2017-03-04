//Celena Williams

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

import Bank.*;

public class WriteRandomFile extends JFrame {
    private RandomAccessFile output;
    private BankUI userInterface;
    private JButton enterButton, openButton;

    private static final int NUMBER_RECORDS = 100;

    public WriteRandomFile () {
        super ("Write to random access file");

        userInterface = new BankUI (4);
        getContentPane ().add (userInterface, BorderLayout.CENTER);

        openButton = userInterface.getDoTask1Button ();
        openButton.setText ("Open...");

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
                    if (output != null)
                        addRecord ();

                    closeFile ();
                }//END public void windowClosing (WindowEvent event)
            }//END new WindowAdapter ()
        );//END addWindowListener

        enterButton = userInterface.getDoTask2Button ();
        enterButton.setText ("Enter");
        enterButton.setEnabled (false);

        enterButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    addRecord ();
                }//END public void actionPerformed (ActionEvent event)
            }//END public void actionPerformed (ActionEvent event)
        );//END enterButton.addActionListener

        setSize (300, 150);
        setVisible (true);
    }//END public WriteRandomFile ()

    private void openFile () {
        JFileChooser fileChooser = new JFileChooser ();
        fileChooser.setFileSelectionMode (JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog (this);

        if (result == JFileChooser.CANCEL_OPTION)
            return;

        File fileName = fileChooser.getSelectedFile ();

        if (fileName == null || fileName.getName ().equals ("")) {
            JOptionPane.showMessageDialog (this, "Invalid File Name", 
                                           "Invalid File Name", 
                                           JOptionPane.ERROR_MESSAGE);
        }//END if (fileName == null || fileName.getName ().equals (""))
        else {
            try {
                output = new RandomAccessFile (fileName, "rw");
                enterButton.setEnabled (true);
                openButton.setEnabled (false);
            }//END try
            catch (IOException ioException) {
                JOptionPane.showMessageDialog (this, "File does not exist", 
                                               "Invalid File Name", 
                                               JOptionPane.ERROR_MESSAGE);
            }//END catch (IOException ioException)
        }//END else
    }//END private void openFile ()

    private void closeFile () {
        try {
            if (output != null)
                output.close ();

            System.exit (0);
        }//END try
        catch (IOException ioException) {
            JOptionPane.showMessageDialog (this, "Error closing file", 
                                           "Error", 
                                           JOptionPane.ERROR_MESSAGE);

            System.exit (1);
        }//END catch (IOException ioException)
    }//END private void closeFile ()

    private void addRecord () {
        String fields [] = userInterface.getFieldValues ();

        if (!fields [BankUI.ACCOUNT].equals ("")) {
            try {
                int accountNumber = Integer.parseInt (fields [BankUI.ACCOUNT]);

                if (accountNumber > 0 && accountNumber <= NUMBER_RECORDS) {
                    RandomAccessAccountRecord record = new 
                                                   RandomAccessAccountRecord ();

                    record.setAccount (accountNumber);
                    record.setFirstName (fields [BankUI.FIRSTNAME]);
                    record.setLastName (fields [BankUI.LASTNAME]);
                    record.setBalance (Double.parseDouble (fields 
                                                             [BankUI.BALANCE]));

                    output.seek ((accountNumber = 1) * 
                                                RandomAccessAccountRecord.SIZE);
                    record.write (output);
                }//END if (accountNumber > 0 && accountNumber <= NUMBER_RECORDS)
                else
                    JOptionPane.showMessageDialog (this,
                                            "Account must be between 1 and 100", 
                                            "Invalid account number", 
                                            JOptionPane.ERROR_MESSAGE);

                userInterface.clearFields ();
            }//END try
            catch (NumberFormatException formatException) {
                JOptionPane.showMessageDialog (this, 
                                                "Bad account number of balance",
                                                "Invalid Number Format", 
                                                JOptionPane.ERROR_MESSAGE);
            }//END catch (NumberFormatException formatException)
            catch (IOException ioException) {
                JOptionPane.showMessageDialog (this,"Error writing to the file",
                                                    "IO Exception", 
                                                    JOptionPane.ERROR_MESSAGE);

                closeFile ();
            }//END catch (IOException ioException)
        }//END if (!fields [BankUI.ACCOUNT].equals (""))
    }//END private void addRecord ()

    public static void main (String [] args) {
        new WriteRandomFile ();
    }//END public static void main (String [] args)
}//END public class WriteRandomFile