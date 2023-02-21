import util.Input;

public class ExceptionLec {
                                            // main will now throw the exception, whoever called the exception will have to deal with it
//    public static void main(String[] args) throws Exception {
    public static void main(String[] args) {

        // throw an exception
        // no code executes until the exception is handled
        // show code underneath does not execute
//        throw new RuntimeException();
//        System.out.println("does this print?");

        // why deliberately throw an exception?
        // to indicate that something abnormal or wrong happened
        // AND potentially respond to it in an appropriate way

        // how to respond (handle) in an appropriate way?
        // show catch
        // can use above exception to catch it as soon as you throw it
        try {
            throw new RuntimeException("boo");
            // below will not execute
//            System.out.println("will this code print?");
        } catch (RuntimeException e) {
            System.out.println("an exception occurred: ");
        } finally {
            // cleanup happens here, ex close files
            System.out.println("finally code always executes");
        }

        System.out.println("\nprogram is still going");

        // show finally

        // use ArithmeticException as an example (div by 0)
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("don't divide by zero.");
        }

        System.out.println("\nprogram is still going");

        try {
            int[] nums = new int[10];
            nums[11] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("does the exception handler print 1");
        } catch (Exception e) {
            System.out.println("does the exception handler print 2");
        }

        // use the ArrayIndexOutOfBounds example with multiple catches
        // most specific wins

        // SCOPE: declare a variable in the try block and try to use it anywhere else

        // Checked exceptions
        // use indentation preference example
        // show the CHOICE of throws or try/catch
        // when to throw or handle
//        try {
//            throw new Exception("checked exception");
//        } catch (Exception e) {
//            // commenting out this line will continue the program
////            throw new RuntimeException(e);
//        }

//        throw new Exception("checked exception");
        try {
            String userInput = getUserInput().toString();
        } catch (Exception e) {
            System.out.println("hey main chill out");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }



        // Unchecked exceptions are things that may happen, but are unlikely

        // Custom exceptions


    }

    private static System getUserInput() throws Exception {
        throw new Exception("the user hates us!");
    }
}
