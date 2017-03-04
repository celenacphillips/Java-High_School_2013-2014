//Celena Williams

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class MyFile extends JFrame implements ActionListener {
    private JTextField enterField;
    private JButton saveButton, keepButton, deleteButton;
    private JPanel southPanel;
    private ObjectOutputStream output;

    public MyFile () {
        super ("MyFile");

        Container container = getContentPane ();
        container.setLayout (new BorderLayout ());

        enterField = new JTextField (20);
        saveButton = new JButton ("Save");
        saveButton.addActionListener (this);
        saveButton.setActionCommand ("save");
        keepButton = new JButton ("Keep?");
        keepButton.addActionListener (this);
        keepButton.setActionCommand ("keep");
        deleteButton = new JButton ("Delete?");
        deleteButton.addActionListener (this);
        deleteButton.setActionCommand ("delete");

        southPanel = new JPanel ();
        southPanel.setLayout (new BorderLayout ());

        container.add (enterField, BorderLayout.NORTH);
        container.add (southPanel, BorderLayout.SOUTH);

        southPanel.add (saveButton, BorderLayout.WEST);
        southPanel.add (keepButton, BorderLayout.CENTER);
        southPanel.add (deleteButton, BorderLayout.EAST);

        enterField.setText ("Enter the file to delete...");
        enterField.setEnabled (false);
        saveButton.setEnabled (true);
        keepButton.setEnabled (false);
        deleteButton.setEnabled (false);

        setSize (500, 500);
        setVisible (true);
    }//END public MyFile ()

    public void actionPerformed (ActionEvent e) {
        String arg = e.getActionCommand ();

        if (arg.equals ("save")) {
            JFileChooser fileChooser = new JFileChooser ();

            int result = fileChooser.showSaveDialog (this);

            if (result == JFileChooser.CANCEL_OPTION)
                return;

            File fileName = fileChooser.getSelectedFile ();

            if (fileName == null || fileName.getName ().equals ("")) {
                JOptionPane.showMessageDialog (this, "Invalid File Name", 
                                               "Invalid File Name", 
                                               JOptionPane.ERROR_MESSAGE);
            }//END if (fileName == null || fileName.getName ().equals (""))

            try {
                output = new ObjectOutputStream(new FileOutputStream(fileName));

                String record = "";

                output.writeObject (record);
                output.flush ();
            }//END try
            catch (IOException ioException) {
                JOptionPane.showMessageDialog (this, "Error writing to file", 
                                               "IO Exception",
                                               JOptionPane.ERROR_MESSAGE);
            }//END catch (IOException ioException)

            keepButton.setEnabled (true);
            deleteButton.setEnabled (true);
            saveButton.setEnabled (false);
        }//END if (arg.equals ("save"))

        if (arg.equals ("keep")) {
            keepButton.setEnabled (false);
            deleteButton.setEnabled (false);
            saveButton.setEnabled (false);

            JOptionPane.showMessageDialog (this, "File has been kept", 
                                           "File has been kept", 
                                           JOptionPane.INFORMATION_MESSAGE);
        }//END if (arg.equals ("keep"))

        if (arg.equals ("delete")) {//work on this
            JFileChooser fileChooser = new JFileChooser ();

            File fileName = fileChooser.getSelectedFile ();

            boolean success = fileName.delete ();

            if (!success) {
                JOptionPane.showMessageDialog (null, "File not deleted", 
                                               "File not deleted", 
                                               JOptionPane.ERROR_MESSAGE);
            }//END if (!success)
            else {
                JOptionPane.showMessageDialog (null, "File deleted", 
                                               "File deleted", 
                                               JOptionPane.INFORMATION_MESSAGE);

                keepButton.setEnabled (false);
                deleteButton.setEnabled (false);
                saveButton.setEnabled (false);
            }//END else
        }//END if (arg.equals ("delete"))
    }//END public void actionPerformed (ActionEvent e)

    public static void main (String [] args) {
        MyFile application = new MyFile ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class MyFile