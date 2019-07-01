package exceptions;

public class ChainedExceptions {

    static void execute() {
        NullPointerException npe = new NullPointerException("npe"); // create an exception
        npe.initCause(new ArithmeticException("ae")); // add a cause

        throw npe;
    }

    public static void main(String[] args) {
        try {
            execute();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);
            System.out.println("Original cause: " + e.getCause());
        }
    }

}
