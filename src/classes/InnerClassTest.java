package classes;

/**
 * It is possible to define a class within another class; such classes are known as
 * nested classes. The scope of nested class is bounded by the scope of its
 * enclosing class. There are two types of nested classes: static and non-static.
 * The most important type of nested class is the inner class. An inner class is a
 * non-static nested class. It has access to all of the variables and methods of its
 * outer class and may be refer to them directly in the same way that other non-static
 * members of the outer class do.
 */

class Outer {

    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }

}

public class InnerClassTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }

}
