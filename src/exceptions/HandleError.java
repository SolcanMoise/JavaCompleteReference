package exceptions;

/**
 * Handle exception using try and catch.
 */
public class HandleError {

    public static void main(String[] args) {

        int d, a;

        try {
            d = 0;
            a = 10 / d;
            System.out.println("This will not be printed.");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("After catch statement");

    }

}
