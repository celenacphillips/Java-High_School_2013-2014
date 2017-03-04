//Celena Williams

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class FileTest extends JFrame implements ActionListener {
    private JTextField enterField;
    private JTextArea outputArea;

    public FileTest () {
        super ("Testing class File");

        enterField = new JTextField ("Enter file or directory name here");
        enterField.addActionListener (this);
        outputArea = new JTextArea ();

        JScrollPane scrollPane = new JScrollPane ();
        scrollPane.add (outputArea);

        Container container = getContentPane ();
        container.add (enterField, BorderLayout.NORTH);
        container.add (scrollPane, BorderLayout.CENTER);

        setSize (400, 400);
        setVisible (true);
    }//END public FileTest ()

    public void actionPerformed (ActionEvent actionEvent) {
        File name = new File (actionEvent.getActionCommand ());

        if (name.exists ()) {
            outputArea.setText (name.getName () + " exists\n" + 
                                (name.isFile () ? "is a file\n" : 
                                "is not a file\n") +  (name.isDirectory () ? 
                                "is a directory\n" : "is not a directory\n") + 
                                (name.isAbsolute () ? "is absolute path\n" : 
                                "is not absolute path\n") + "Last modified: " + 
                                name.lastModified () + "\nLength: " + 
                                name.length () + "\nPath: " + name.getPath () + 
                                "\nAbsolute path: " + name.getAbsolutePath () + 
                                "\nParent: " + name.getParent ());

            if (name.isFile ()) {
                try {
                    BufferedReader input = new BufferedReader (new FileReader 
                                                                        (name));
                    StringBuffer buffer = new StringBuffer ();
                    String text;
                    outputArea.append ("\n\n");

                    while ((text = input.readLine ()) != null)
                        buffer.append (text + "\n");

                    outputArea.append (buffer.toString ());
                }//END try
                catch (IOException ioException) {
                    JOptionPane.showMessageDialog (this, "FILE ERROR",
                                                   "FILE ERROR", 
                                                   JOptionPane.ERROR_MESSAGE);
                }//END catch (IOException ioException)
            }//END if (name.isFile ())
            else
                if (name.isDirectory ()) {
                    String directory [] = name.list ();

                    outputArea.append ("\n\nDirectory contents:\n");

                    for (int i = 0; i < directory.length; i++)
                        outputArea.append (directory [i] + "\n");
                }//END if (name.isDirectory ())
        }//END if (name.exists ())
        else {
            JOptionPane.showMessageDialog (this, actionEvent.getActionCommand ()
                                         + " Does Not Exist", "ERROR", 
                                           JOptionPane.ERROR_MESSAGE);
        }//END else
    }//END public void actionPerformed (ActionEvent actionEvent)

    public static void main (String [] args) {
        FileTest application = new FileTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class FileTest