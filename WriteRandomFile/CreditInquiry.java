//Celena Williams

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

import Bank.*;

public class CreditInquiry extends JFrame {
    private JTextArea recordDisplayArea;
    private JButton openButton, creditButton, debitButton, zeroButton;
    private JPanel buttonPanel;

    private ObjectInputStream input;
    private FileInputStream fileInput;
    private File fileName;
    private String accountType;

    static private DecimalFormat twoDigits = new DecimalFormat ("0.00");

    public CreditInquiry () {
        super ("Credit Inquiry Program");

        Container container = getContentPane ();
        buttonPanel = new JPanel ();

        openButton = new JButton ("Open File");
        buttonPanel.add (openButton);

        openButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    openFile ();
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END openButton.addActionListener

        creditButton = new JButton ("Credit balances");
        buttonPanel.add (creditButton);
        creditButton.addActionListener (new ButtonHandler ());

        debitButton = new JButton ("Debit balances");
        buttonPanel.add (debitButton);
        debitButton.addActionListener (new ButtonHandler ());

        zeroButton = new JButton ("Zero balances");
        buttonPanel.add (zeroButton);
        zeroButton.addActionListener (new ButtonHandler ());

        recordDisplayArea = new JTextArea ();
        JScrollPane scroller = new JScrollPane (recordDisplayArea);

        container.add (scroller, BorderLayout.CENTER);
        container.add (buttonPanel, BorderLayout.SOUTH);

        creditButton.setEnabled (false);
        debitButton.setEnabled (false);
        zeroButton.setEnabled (false);

        addWindowListener (
            new WindowAdapter () {
                public void windowClosing (WindowEvent event) {
                    closeFile ();
                    System.exit (0);
                }//END public void windowClosing (WindowEvent event)
            }//END new WindowAdapter ()
        );//END addWindowListener

        pack ();
        setSize (600, 250);
        setVisible (true);
    }//END public CreditInquiry ()

    private void openFile () {
        JFileChooser fileChooser = new JFileChooser ();
        fileChooser.setFileSelectionMode (JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog (this);

        if (result == JFileChooser.CANCEL_OPTION)
                return;

        fileName = fileChooser.getSelectedFile ();

        if (fileName == null || fileName.getName ().equals (""))
            JOptionPane.showMessageDialog (this, "Invalid File Name", 
                                           "Invalid File Name", 
                                           JOptionPane.ERROR_MESSAGE);

        try {
            if (input != null)
                input.close ();

            fileInput = new FileInputStream (fileName);
            input = new ObjectInputStream (fileInput);
            openButton.setEnabled (false);
            creditButton.setEnabled (true);
            debitButton.setEnabled (true);
            zeroButton.setEnabled (true);
        }//END try
        catch (IOException ioException) {
            JOptionPane.showMessageDialog (this, "File does not exist", 
                                           "Invalid File Name", 
                                           JOptionPane.ERROR_MESSAGE);
        }//END catch (IOException ioException)
    }//END private void openFile ()

    private void closeFile () {
        try {
            if (input != null)
                input.close ();
        }//END try
        catch (IOException ioException) {
            JOptionPane.showMessageDialog (this, "Error closing file", 
                                           "Error", JOptionPane.ERROR_MESSAGE);

            System.exit (1);
        }//END catch (IOException ioException)
    }//END private void closeFile ()

    private void readRecords () {
        AccountRecord record;

        try {
            if (input != null)
                input.close ();

            fileInput = new FileInputStream (fileName);
            input = new ObjectInputStream (fileInput);

            recordDisplayArea.setText ("The accounts are:\n");

            while (true) {
                record = (AccountRecord) input.readObject ();

                if (shouldDisplay (record.getBalance ()))
                    recordDisplayArea.append (record.getAccount () + "\t" + 
                                              record.getFirstName () + "\t" + 
                                              record.getLastName () + "\t" + 
                                              twoDigits.format 
                                              (record.getBalance ()) + "\n");
            }//END while (true)
        }//END try
        catch (EOFException eofException) {
            closeFile ();
        }//END catch (EOFException eofException)
        catch (ClassNotFoundException classNotFound) {
            JOptionPane.showMessageDialog (this, "Unable to create object", 
                                           "Class Not Found", 
                                           JOptionPane.ERROR_MESSAGE);
        }//END catch (ClassNotFoundException classNotFound)
        catch (IOException ioException) {
            JOptionPane.showMessageDialog (this, "Error reading from file", 
                                           "Error", JOptionPane.ERROR_MESSAGE);
        }//END catch (IOException ioException)
    }//END private void readRecords ()

    private boolean shouldDisplay (double balance) {
        if (accountType.equals ("Credit balances") && balance < 0)
            return true;
        else
            if (accountType.equals ("Debit balances") && balance > 0)
                return true;
            else
                if (accountType.equals ("Zero balances") && balance == 0)
                    return true;

        return false;
    }//END private boolean shouldDisplay (double balance)

    public static void main (String [] args) {
        new CreditInquiry ();
    }//END public static void main (String [] args)

    private class ButtonHandler implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            accountType = event.getActionCommand ();
            readRecords ();
        }//END public void actionPerformed (ActionEvent event)
    }//END private class ButtonHandler
}//END public class CreditInquiry