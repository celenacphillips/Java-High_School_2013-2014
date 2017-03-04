//Celena Williams

public class UsingExceptions3 {
    public static void main (String [] args) {
        try {
            method1 ();
        }//END try
        catch (Exception exception) {
            System.err.println (exception.getMessage () + "\n");
            exception.printStackTrace ();

            StackTraceElement [] traceElements = exception.getStackTrace ();

            System.out.println ("\nStack trace from getStackTrace");
            System.out.println ("Class\t\tFile\t\tLine\tMethod");

            for (int i = 0; i < traceElements.length; i++) {
                StackTraceElement currentElement = traceElements [i];
                System.out.println (currentElement.getClassName () + "\t");
                System.out.println (currentElement.getFileName () + "\t");
                System.out.println (currentElement.getLineNumber () + "\t");
                System.out.println (currentElement.getMethodName () + "\n");
            }//END for (int i = 0; i < traceElements.length; i++)
        }//END catch (Exception exception)
    }//END public static void main (String [] args)

    public static void method1 () throws Exception {
        method2 ();
    }//END public static void method1 ()

    public static void method2 () throws Exception {
        method3 ();
    }//END public static void method2 ()

    public static void method3 () throws Exception {
        throw new Exception ("Exception thrown in method3");
    }//END public static void method3 ()
}//END public class UsingExceptions3