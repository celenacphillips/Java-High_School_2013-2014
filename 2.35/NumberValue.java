//Celena Williams

import javax.swing.JOptionPane;

public class NumberValue {
    public static void main (String [] args) {
        int one, two, three, four, five;

        String oneStr, twoStr, threeStr, fourStr, fiveStr;

        int positive = 0;
        int negative = 0;
        int zero = 0;

        oneStr = JOptionPane.showInputDialog ("Enter first number");
        twoStr = JOptionPane.showInputDialog ("Enter second number");
        threeStr = JOptionPane.showInputDialog ("Enter third number");
        fourStr = JOptionPane.showInputDialog ("Enter fourth number");
        fiveStr = JOptionPane.showInputDialog ("Enter fifth number");

        one = Integer.parseInt (oneStr);
        two = Integer.parseInt (twoStr);
        three = Integer.parseInt (threeStr);
        four = Integer.parseInt (fourStr);
        five = Integer.parseInt (fiveStr);

        if (one > 0)
            positive++;
        if (two > 0)
            positive++;
        if (three > 0)
            positive++;
        if (four > 0)
            positive++;
        if (five > 0)
            positive++;

        if (one < 0)
            negative++;
        if (two < 0)
            negative++;
        if (three < 0)
            negative++;
        if (four < 0)
            negative++;
        if (five < 0)
            negative++;

        if (one == 0)
                zero++;
        if (two == 0)
                zero++;
        if (three == 0)
                zero++;
        if (four == 0)
                zero++;
        if (five == 0)
                zero++;

        if (positive == 1 && negative != 1 && zero != 1)
            JOptionPane.showMessageDialog (null, "There are:\n" + positive + 
                                           " positive number\n" + negative + 
                                           " negative numbers\n" + zero + 
                                           " zeros");
        else if (positive != 1 && negative == 1 && zero != 1)
            JOptionPane.showMessageDialog (null, "There are:\n" + positive + 
                                           " positive numbers\n" + negative + 
                                           " negative number\n" + zero + 
                                           " zeros");
        else if (positive != 1 && negative != 1 && zero == 1)
            JOptionPane.showMessageDialog (null, "There are:\n" + positive + 
                                           " positive numbers\n" + negative + 
                                           " negative numbers\n" + zero + 
                                           " zero");
        else
            JOptionPane.showMessageDialog (null, "ERROR!\nCounters do not" + 
                                           " match input.\nCoding Error!");
    }//END public static void main (String [] args)
}//END public class NumberValue