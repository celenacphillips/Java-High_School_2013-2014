//Celena Williams

public class UsingChainedExceptions {
    public static void main (String [] args) {
        try {
            method1 ();
        }//END try
        catch (Exception exception) {
            exception.printStackTrace ();
        }//END catch (Exception exception)
    }//END public static void main (String [] args)

    public static void method1 () throws Exception {
        try {
            method2 ();
        }//END try
        catch (Exception exception) {
            throw new Exception ("Exception thrown in method1", exception);
        }//END catch (Exception exception)
    }//END public static void method1 ()

    public static void method2 () throws Exception {
        try {
            method3 ();
        }//END try
        catch (Exception exception) {
            throw new Exception ("Exception thrown in method2", exception);
        }//END catch (Exception exception)
    }//END public static void method2 ()

    public static void method3 () throws Exception {
        throw new Exception ("Exception thrown in method3");
    }//END public static void method3 ()
}//END public class UsingChainedExceptions