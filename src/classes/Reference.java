package classes;

/**
 * In general, there are two ways that a computer language can pass an argument to a subroutine.
 * The first way is call-by-value, and the second one is call-by-reference. Java support both of them,
 * depending upon what is passed
 */
public class Reference {

    int a, b;

    Reference(){}

    Reference( int x, int y) {
        a = x;
        b = y;
    }

    // Primitive types are passed by value
    void method(int a, int b) {
        a *= 2;
        b /= 3;
    }

    void method(Reference ref) {
        ref.a *=2;
        ref.b /=3;
    }

}

class TestByValue {

    public static void main(String[] args) {
        Reference ref = new Reference();
        int a = 10, b = 20;
        System.out.println("Before call: a = " + a + " and b = " + b);
        ref.method(a, b);
        System.out.println("After call: a = " + a + " and b = " + b);
    }

}

class TestByReference {

    public static void main(String[] args) {
        Reference ref = new Reference(4, 6);
        System.out.println("Before call: ref.a = " + ref.a + " and ref.b = " + ref.b);
        ref.method(ref);
        System.out.println("After call: ref.a = " + ref.a + " and ref.b = " + ref.b);
    }

}
