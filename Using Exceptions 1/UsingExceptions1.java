//Celena Williams

public class UsingExceptions1 {
    public static void main (String [] args) {
        try {
            throwException ();
        }//END try
        catch (Exception exception) {
            System.err.println ("Exception handled in main");
        }//END catch (Exception exception)

        doesNotThrowException ();
    }//END public static void main (String [] args)

    public static void throwException () throws Exception {
        try {
            System.out.println ("Method throwException");
            throw new Exception ();
        }//END try
        catch (Exception exception) {
            System.err.println ("Exception handled in method throwException");
            throw exception;
        }//END catch (Exception exception)
        finally {
             System.err.println ("Finally exeuted in throwException");
        }//END finally
    }//END public static void throwException ()

    public static void doesNotThrowException () {
        try {
            System.out.println ("Method doesNotThrowException");
        }//END try
        catch (Exception exception) {
            System.err.println (exception);
        }//END catch (Exception exception)
        finally {
            System.err.println ("Finally executed in doesNotThrowException");
        }//END finally

        System.out.println ("End of method doesNotThrowException");
    }//END public static void doesNotThrowException ()
}//END public class UsingExceptions1