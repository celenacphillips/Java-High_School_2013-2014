//Celena Williams

import javax.swing.JOptionPane;

public class Payroll {
    public static void main (String [] args) {
        int hoursWorked, overtime;
        int counter = 1;
        double salary = 0;
        double grossPay, overtimePay;

        String strHoursWorked, strSalary, name;

        while (counter <= 3) {
            name = JOptionPane.showInputDialog ("Enter name");
            strHoursWorked= JOptionPane.showInputDialog
                                               ("Enter number of hours worked");
            strSalary = JOptionPane.showInputDialog ("Enter salary by hour");

            hoursWorked = Integer.parseInt (strHoursWorked);
            salary = Double.parseDouble (strSalary);

            overtimePay = salary * 1.5;

            if (hoursWorked <= 40) {
                    grossPay = salary * hoursWorked;

                    JOptionPane.showMessageDialog (null, "For " + name + 
                                                   "\n\nHours worked: " + 
                                                   hoursWorked + "\nSalary: $" +
                                                   salary + "\nGross Pay: $" + 
                                                   grossPay);

                    counter++;
            }//END if (hoursWorked <= 40)
            
            else if (hoursWorked > 40) {
                overtime = hoursWorked - 40;

                grossPay = (salary * 40) + (overtimePay * overtime);

                JOptionPane.showMessageDialog (null, "For " + name + 
                                               "\n\nHours worked: " + 
                                               hoursWorked + "\nSalary: $" + 
                                               salary + "\nGross Pay: $" + 
                                               grossPay);

                counter++;
            }//END else if (hoursWorked > 40)
        }//END while (counter <= 3)
    }//END public static void main (String [] args)
}//END public class Payroll