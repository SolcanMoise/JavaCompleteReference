package exceptions;

/**
 * If a method is capable of causing an exception that it does not handle, it must
 * specify this behavior so that callers of the method can guard themselves against
 * that exception.
 */
public class ThrowsClause {

    static void throwOne() throws IllegalAccessException {
        throw new IllegalAccessException("IAE");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }

}
