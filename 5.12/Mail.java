//Celena Williams

import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class Mail {
    public static void main (String [] args) {
        String input, caseInput1, caseInput2, caseInput3, caseInput4,caseInput5;

        int choice = 0;
        int input1 = 0;
        int input2 = 0;
        int input3 = 0;
        int input4 = 0;
        int input5 = 0;
        int totalItems = 0;

        double case1Total, case2Total, case3Total, case4Total, case5Total;
        double totalPrice = 0;

        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance (Locale.US);

        while (choice != -1) {
            input = JOptionPane.showInputDialog ("Enter 1 for Product 1\nEnter" 
                                               + " 2 for Product 2\nEnter 3 " + 
                                                 "for Product 3\nEnter 4 for" + 
                                                 " Product 4\nEnter 5 for " + 
                                                 "Product 5\n\nEnter -1 when " +
                                                 "you are finished");

            choice = Integer.parseInt (input);

            switch (choice) {
                case 1:
                    caseInput1 = JOptionPane.showInputDialog
                                   ("Enter an integer quantity for\nProduct 1");
                    input1 = Integer.parseInt (caseInput1);
                    case1Total = input1 * 2.98;
                    totalItems += input1;
                    totalPrice += case1Total;
                    break;

                case 2:
                    caseInput2 = JOptionPane.showInputDialog
                                   ("Enter an integer quantity for\nProduct 2");
                    input2 = Integer.parseInt (caseInput2);
                    case2Total = input2 * 4.50;
                    totalItems += input2;
                    totalPrice += case2Total;
                    break;

                case 3:
                    caseInput3 = JOptionPane.showInputDialog
                                   ("Enter an integer quantity for\nProduct 3");
                    input3 = Integer.parseInt (caseInput3);
                    case3Total = input3 * 9.98;
                    totalItems += input3;
                    totalPrice += case3Total;
                    break;

                case 4:
                    caseInput4 = JOptionPane.showInputDialog
                                   ("Enter an integer quantity for\nProduct 4");
                    input4 = Integer.parseInt (caseInput4);
                    case4Total = input4 * 4.49;
                    totalItems += input4;
                    totalPrice += case4Total;
                    break;

                case 5:
                    caseInput5 = JOptionPane.showInputDialog
                                   ("Enter an integer quantity for\nProduct 5");
                    input5 = Integer.parseInt (caseInput5);
                    case5Total = input5 * 6.87;
                    totalItems += input5;
                    totalPrice += case5Total;
                    break;

                default:
                    break;
            }//END switch (choice)
        }//END while (choice != -1)
        JOptionPane.showMessageDialog (null, "Your total price is " + 
                                       moneyFormat.format (totalPrice) + 
                                       ".\nYou bought " + totalItems + 
                                       " 	items.\n" + input1 + 
                                       " of Product 1\n" + input2 + 
                                       " of Product 2\n" + input3 + 
                                       " of Product 3\n" + input4 + 
                                       " of Product 4\n" + input5 + 
                                       " of Product 5");
    }//END public static void main (String [] args)
}//END public class Mail