//Celena Williams

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Bank.*;

public class CreateSequentialFile extends JFrame {
    private ObjectOutputStream output;
    private BankUI userInterface;
    private JButton enterButton, openButton;

    public CreateSequentialFile () {
        super ("Creating a Sequential File of Objects");

        userInterface = new BankUI (4);
        getContentPane ().add (userInterface, BorderLayout.CENTER);

        openButton = userInterface.getDoTask1Button ();
        openButton.setText ("Save into File...");

        openButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    openFile ();
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END openButton.addActionListener

        enterButton = userInterface.getDoTask2Button ();
        enterButton.setText ("Enter");
        enterButton.setEnabled (false);

        enterButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    addRecord ();
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END enterButton.addActionListener

        addWindowListener (
            new WindowAdapter () {
                public void windowClosing (WindowEvent event) {
                    if (output != null)
                        addRecord ();

                    closeFile ();
                }//END public void windowClosing (WindowEvent event)
            }//END new WindowAdapter ()
        );//END addWindowListener

        setSize (300, 200);
        setVisible (true);
    }//END public CreateSequentialFile ()

    private void openFile () {
        JFileChooser fileChooser = new JFileChooser ();
        fileChooser.setFileSelectionMode (JFileChooser.FILES_ONLY);

        int result = fileChooser.showSaveDialog (this);

        if (result == JFileChooser.CANCEL_OPTION)
                return;

        File fileName = fileChooser.getSelectedFile ();

        if (fileName == null || fileName.getName ().equals (""))
                JOptionPane.showMessageDialog (this, "Invalid File Name", 
                                               "Invalid File Name", 
                                               JOptionPane.ERROR_MESSAGE);
        else {
            try {
                output = new ObjectOutputStream(new FileOutputStream(fileName));

                openButton.setEnabled (false);
                enterButton.setEnabled (true);
            }//END try
            catch (IOException ioException) {
                JOptionPane.showMessageDialog (this, "Error Opening File",
                                               "Error",
                                               JOptionPane.ERROR_MESSAGE);
            }//END catch (IOException ioException)
        }//END else
    }//END private void openFile ()

    private void closeFile () {
        try {
            output.close ();
            System.exit (0);
        }//END try
        catch (IOException ioException) {
            JOptionPane.showMessageDialog (this, "Error closing file", "Error", 
                                           JOptionPane.ERROR_MESSAGE);
            System.exit (1);
        }//END catch (IOException ioException)
    }//END private void closeFile ()

    public void addRecord () {
        int accountNumber = 0;
        AccountRecord record;
        String fieldValues [] = userInterface.getFieldValues ();

        if (!fieldValues [BankUI.ACCOUNT].equals ("")) {
            try {
                accountNumber =Integer.parseInt (fieldValues [BankUI.ACCOUNT]);

                if (accountNumber > 0) {
                    record = new AccountRecord (accountNumber, fieldValues 
                            [BankUI.FIRSTNAME], fieldValues [BankUI.LASTNAME], 
                            Double.parseDouble (fieldValues [BankUI.BALANCE]));

                    output.writeObject (record);
                    output.flush ();
                }//END if (accountNumber > 0)
                else {
                    JOptionPane.showMessageDialog (this,
                                        "Account number must be greater than 0",
                                        "Bad account number",
                                        JOptionPane.ERROR_MESSAGE);
                }//END else
                userInterface.clearFields ();
            }//END try
            catch (NumberFormatException formatException) {
                JOptionPane.showMessageDialog (this,
                                                "Bad account number or balance",
                                                "Invalid Number Format", 
                                                JOptionPane.ERROR_MESSAGE);
            }//END catch (NumberFormatException formatException)
            catch (IOException  ioException) {
                JOptionPane.showMessageDialog (this, "Error writing to file", 
                                               "IO Exception", 
                                               JOptionPane.ERROR_MESSAGE);
                closeFile ();
            }//END catch (IOException  ioException)
        }//END if (!fieldValues [BankUI.ACCOUNT].equals (""))
    }//END public void addRecord ()

    public static void main (String [] args) {
        new CreateSequentialFile ();
    }//END public static void main (String [] args)
}//END public class CreateSequentialFile