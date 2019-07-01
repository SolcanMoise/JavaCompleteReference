package exceptions;

/**
 * Throw an exception explicitly.
 */
public class ThrowExceptions {

    static void proces() {

        try {
            throw new NullPointerException("NPE");
        } catch (NullPointerException npe) {
            System.out.println("Exception: " + npe);
            throw npe; // rethrow the exception
        }

    }

    public static void main(String[] args) {

        try {
            proces();
        } catch (NullPointerException e) {
            System.out.println("ReCaught " + e);
        }

    }

}
