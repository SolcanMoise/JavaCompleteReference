package operators;

/**
 * Arithmetic operators are used in mathematical expressions in the same way that are used in algebra.
 * The compound assignment operators provides two benefits. First they save you a bit of typing, and second
 * they are implemented more efficiently by the Java run-time system than are their equivalent long form.
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
