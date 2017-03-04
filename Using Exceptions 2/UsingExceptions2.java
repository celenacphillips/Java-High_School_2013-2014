//Celena Williams

public class UsingExceptions2 {
    public static void main (String [] args) {
        try {
            throwException ();
        }//END try
        catch (Exception exception) {
            System.err.println ("Exception handled in main");
        }//END catch (Exception exception)
    }//END public static void main (String [] args)

    public static void throwException () throws Exception {
        try {
            System.out.println ("Method throwException");
            throw new Exception ();
        }//END try
        catch (RuntimeException runtimeException) {
            System.err.println ("Exception handled in method throwException");
        }//END catch (RuntimeException runtimeException)
        finally {
            System.err.println ("Finally is always executed");
        }//END finally
    }//END public static void throwException ()
}//END public class UsingExceptions2