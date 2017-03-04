// Fig. 17.7: AccountRecord.java
// A class that represents one record of information.
package Bank;

import java.io.Serializable;

public class AccountRecord implements Serializable {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    // no-argument constructor calls other constructor with default values
    public AccountRecord () {
        this (0, "", "", 0.0);
    }//END public AccountRecord ()

    // initialize a record
    public AccountRecord (int acct, String first, String last, double bal) {
        setAccount (acct);
        setFirstName (first);
        setLastName (last);
        setBalance (bal);
    }//END public AccountRecord(int acct, String first, String last, double bal)

    // set account number
    public void setAccount (int acct) {
        account = acct;
    }//END public void setAccount (int acct)

    // get account number
    public int getAccount () {
        return account;
    }//END public int getAccount ()

    // set first name
    public void setFirstName (String first) {
        firstName = first;
    }//END public void setFirstName (String first)

    // get first name
    public String getFirstName () {
        return firstName;
    }//END public String getFirstName ()

    // set last name
    public void setLastName (String last) {
        lastName = last;
    }//END public void setLastName (String last)

    // get last name
    public String getLastName () {
        return lastName;
    }//END public String getLastName ()

    // set balance
    public void setBalance (double bal) {
        balance = bal;
    }//END public void setBalance (double bal)

    // get balance
    public double getBalance () {
        return balance;
    }//END public double getBalance ()
}//END public class AccountRecord