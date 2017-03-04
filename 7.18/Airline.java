//Celena Williams

import javax.swing.*;

public class Airline {
    public static void main (String [] args) {
        int choice, choice2;//integers for switch case
        int firstClassCounter = 1;//starting at the first first class seat
        int economyCounter = 6;//starting at the first economy seat
        int passenger = 1;//starting with the first passenger
        String number, number2;//String input from user
        String output;

        //only ten or less passengers can ride on the plane
        while (passenger <= 10) {
            number = JOptionPane.showInputDialog
                                 ("Type 1 for First Class\nType 2 for Economy");
            choice = Integer.parseInt (number);

            switch (choice) {
                case 1://first class
                    if (firstClassCounter < 6) {//if first class is not filled
                        output = "Boardng Pass for Passanger # " + passenger +
                                 "\n\nSeat #: " + firstClassCounter + 
                                 "\nFirst Class";
                        JOptionPane.showMessageDialog (null, output);

                        firstClassCounter++;//signifies assigned seat is filled
                    }//END if (firstClassCounter < 6)
                    else if (firstClassCounter >= 6) {//if first class is full
                        number2 = JOptionPane.showInputDialog
                                  ("Section is full.\n\nIs it acceptable to " + 
                                   "seat in the Economy section?\nType 1 for" + 
                                   " yes\nType 2 for no");
                        choice2 = Integer.parseInt (number2);

                        switch (choice2) {
                            case 1://okay to sit in economy
                                //if economy is not full
                                if (economyCounter >= 6 || economyCounter < 11){
                                    output = "Boardng Pass for Passanger # " + 
                                             passenger + "\n\nSeat #: " + 
                                             economyCounter + "\nFirst Class";
                                    JOptionPane.showMessageDialog (null,output);

                                    //signifies assigned seat is filled
                                    economyCounter++;
                                }//END if (economyCounter ... 11)
                                break;

                            case 2://not okay to sit in economy
                                output = "Next flight leaves in 3 hours.";
                                JOptionPane.showMessageDialog (null, output);

                                passenger--;//removes passenger from count
                                break;
                        }//END switch (choice2)
                    }//END if (firstClassCounter >= 6)
                    break;//END case 1

                case 2://economy
                    //if economy is not filled
                    if (economyCounter >= 6 && economyCounter < 11) {
                        output = "Boardng Pass for Passanger # " + passenger + 
                                 "\n\nSeat #: " + economyCounter + "\nEconomy";
                        JOptionPane.showMessageDialog (null, output);

                        economyCounter++;//signifies assigned seat is filled
                    }//END if (economyCounter >= 6 && economyCounter < 11)
                    else if (economyCounter >= 10) {//if economy is full
                        number2 = JOptionPane.showInputDialog
                                  ("Section is full.\n\nIs it acceptable to " + 
                                   "seat in the First Class section?\nType 1" +
                                   " for yes\nType 2 for no");
                        choice2 = Integer.parseInt (number2);

                        switch (choice2) {
                            case 1://okay to sit in first class
                                //if first clas is not full
                                if (firstClassCounter < 6) {
                                    output = "Boardng Pass for Passanger # " + 
                                             passenger + "\n\nSeat #: " + 
                                            firstClassCounter + "\nFirst Class";
                                    JOptionPane.showMessageDialog (null,output);

                                    //signifies assigned seat is filled
                                    firstClassCounter++;
                                }//END if (firstClassCounter < 6)
                                break;

                            case 2://not okay to sit in first class
                                output = "Next flight leaves in 3 hours.";
                                JOptionPane.showMessageDialog (null, output);

                                passenger--;//removes passenger from count
                                break;
                        }//END switch (choice2)
                    }//END if (economyCounter >= 10)
                    break;//END case 2
            }//END switch (choice)
            passenger++;//signifies that the passenger has been seated correctly
        }//END while (passenger <= 10)
        
        if (passenger >= 10)//if while loop condition is false
            JOptionPane.showMessageDialog (null, "The plane is full.\nAny more" 
                                         + " passengers will leave on the next" 
                                         + " flight in 3 hours.");

        System.exit (0);
    }//END public static void main (String [] args)
}//END public class Airline