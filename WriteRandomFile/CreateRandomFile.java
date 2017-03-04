//Celena Williams

import java.io.*;
import javax.swing.*;

import Bank.*;

public class CreateRandomFile {
    private static final int NUMBER_RECORDS = 100;

    private void createFile () {
        JFileChooser fileChooser = new JFileChooser ();
        fileChooser.setFileSelectionMode (JFileChooser.FILES_ONLY);

        int result = fileChooser.showSaveDialog (null);

        if (result == JFileChooser.CANCEL_OPTION)
                return;

        File fileName = fileChooser.getSelectedFile ();

        if (fileName == null || fileName.getName ().equals ("")) {
                JOptionPane.showMessageDialog (null, "Invalid File Name", 
                                                "Invalid File Name", 
                                                JOptionPane.ERROR_MESSAGE);
        }//END if (fileName == null || fileName.getName ().equals (""))
        else {
            try {
                RandomAccessFile file = new RandomAccessFile (fileName, "rw");

                RandomAccessAccountRecord blankRecord = new 
                                                   RandomAccessAccountRecord ();

                for (int count = 0; count < NUMBER_RECORDS; count++)
                        blankRecord.write (file);

                file.close ();

                JOptionPane.showMessageDialog (null, "Create file" + fileName, 
                                               "Status", 
                                               JOptionPane.INFORMATION_MESSAGE);

                System.exit (0);
            }//END try
            catch (IOException ioException) {
                JOptionPane.showMessageDialog (null, "Error processing file", 
                                               "Error processing file", 
                                               JOptionPane.ERROR_MESSAGE);

                System.exit (1);
            }//END catch (IOException ioException)
        }//END else
    }//END private void createFile ()

    public static void main (String [] args) {
        CreateRandomFile application = new CreateRandomFile ();
        application.createFile ();
    }//END public static void main (String [] args)
}//END public class CreateRandomFile