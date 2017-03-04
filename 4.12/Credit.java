//Celena Williams

import javax.swing.JOptionPane;

public class Credit {
    public static void main (String [] args) {
        int accountNumber, totalOfAllItems, totalOfAllCredits;

        String strAccountNumber, strTotalOfAllItems, strTotalOfAllCredits;
        String strBeginningBalance, strAllowedCreditLimit;

        double beginningBalance, allowedCreditLimit, newBalance;

        strAccountNumber = JOptionPane.showInputDialog ("Enter account number");
        strBeginningBalance = JOptionPane.showInputDialog
                               ("Enter balance at the\nbeginning of the month");
        strTotalOfAllItems = JOptionPane.showInputDialog
          ("Enter the total of all\nitems charged by\nthe customer this month");
        strTotalOfAllCredits = JOptionPane.showInputDialog
                               ("Enter the total of all\ncredits applied to\n" + 
                                "the customer's account this month");
        strAllowedCreditLimit = JOptionPane.showInputDialog
                                                 ("Enter allowed credit limit");

        accountNumber = Integer.parseInt (strAccountNumber);
        beginningBalance = Double.parseDouble (strBeginningBalance);
        totalOfAllItems = Integer.parseInt (strTotalOfAllItems);
        totalOfAllCredits = Integer.parseInt (strTotalOfAllCredits);
        allowedCreditLimit = Double.parseDouble (strAllowedCreditLimit);

        newBalance = beginningBalance + totalOfAllItems - totalOfAllCredits;

        if (newBalance > allowedCreditLimit)
            JOptionPane.showMessageDialog (null, "For account number: " +
                                           accountNumber + "\nCredit limit " + 
                                           "exceeded.\n\nCurrent balance: $" + 
                                           newBalance + "\nAllowed Credit " + 
                                           "Limit: $" + allowedCreditLimit);
        else if (newBalance <= allowedCreditLimit)
            JOptionPane.showMessageDialog (null, "For account number: " + 
                                           accountNumber + "\nCredit limit " +
                                           "not exceeded.\n\nCurrent balance: $"
                                         + newBalance + "\nAllowed Credit" + 
                                           " Limit: $" + allowedCreditLimit);
    }//END public static void main (String [] args)
}//END public class Credit