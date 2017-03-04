//Celena Williams

public class Table {
    public static void main (String [] args) {
        int N = 1;

        System.out.print ("N\t\t");
        System.out.print ("10*N\t\t");
        System.out.print ("100*N\t\t");
        System.out.println ("1000*N\n");

        while (N <= 5) {
            System.out.print (N + "\t\t");
            System.out.print (N * 10 + "\t\t");
            System.out.print (N * 100 + "\t\t");
            System.out.println (N * 1000);

            N++;
        }//END while (N <= 5)
    }//END public static void main (String [] args)
}//END public class Table

