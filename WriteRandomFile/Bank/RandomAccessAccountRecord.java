//Celena Williams

package Bank;

import java.io.*;

public class RandomAccessAccountRecord extends AccountRecord {
    public static final int SIZE = 72;

    public RandomAccessAccountRecord () {
        this (0, "", "", 0.0);
    }//END public RandomAccessAccountRecord ()

    public RandomAccessAccountRecord (int account, String firstName, 
                                      String lastName, double balance) {
            super (account, firstName, lastName, balance);
    }//END public RandomAccessAccountRecord (int...balance)

    public void read (RandomAccessFile file) throws IOException {
        setAccount (file.readInt ());
        setFirstName (readName (file));
        setLastName (readName (file));
        setBalance (file.readDouble ());
    }//END public void read (RandomAccessFile file)

    private String readName (RandomAccessFile file) throws IOException {
        char name [] = new char [15], temp;

        for (int count = 0; count < name.length; count++) {
            temp = file.readChar ();
            name [count] = temp;
        }//END for (int count = 0; count < name.length; count++)

        return new String (name).replace ('\0', ' ');
    }//END private String readName (RandomAccessFile file)

    public void write (RandomAccessFile file) throws IOException {
        file.writeInt (getAccount ());
        writeName (file, getFirstName ());
        writeName (file, getLastName ());
        file.writeDouble (getBalance ());
    }//END public void write (RandomAccessFile file)

    private void writeName (RandomAccessFile file, String name) 
    throws IOException {
        StringBuffer buffer = null;

        if (name != null)
            buffer = new StringBuffer (name);
        else
            buffer = new StringBuffer (15);

        buffer.setLength (15);
        file.writeChars (buffer.toString ());
    }//END private void writeName (RandomAccessFile file, String name)
}//END public class RandomAccessAccountRecord