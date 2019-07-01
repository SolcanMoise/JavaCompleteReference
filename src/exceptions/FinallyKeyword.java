package exceptions;

/**
 * When exceptions are thrown, execution in a method takes a rather abrupt, nonlinear
 * path that alters the normal flow through the method. Depending upon how the method
 * is coded, it is even possible for an exception to cause the method to return
 * prematurely. The finally keyword is designed to address this contingency.
 */
public class FinallyKeyword {

    static void procA() {
        // Through an exception out of the method.
        try {
            System.out.println("Inside procA");
            throw new RuntimeException("RE");
        } catch (RuntimeException re) {
            System.out.println("Caught Exception: " + re);
        } finally {
            System.out.println("ProcA's finally");
        }
    }

    static void procB() {
        // Return from within a try block.
        try {
            System.out.println("Inside procB");
            return;
        } finally {
            System.out.println("ProcB's finally");
        }
    }

    static void procC() {
        // Execute a try block normally
        try {
            System.out.println("Inside procC");
        } finally {
            System.out.println("ProcC's finally");
        }

    }

    public static void main(String[] args) {

        procA();
        procB();
        procC();

    }

}
