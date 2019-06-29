package inheritance;

/**
 * Inheritance is one of the cornerstones of OOP because it allows the creation of hierarchical
 * classification. using inheritance you can create a general class that defines traits common
 * to a set of related items.
 */

// Create a superclass
class A {

    int i, j;

    void showij() {
        System.out.println(" i and j: " + i + " " + j);
    }

}

// Create a subclass by extending class A
class B extends A {

    int k;

    void showk() {
        System.out.println(" k: " + k);
    }

    void sum() {
        System.out.println(" i + j + k: " + (i + j + k));
    }

}

public class SimpleInheritance {

    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        // the super class may be used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Content of superOb: ");
        superOb.showij();
        System.out.println();

        /*
        The subclass has access to all public members of its superclass.
         */
        subOb.i = 1;
        subOb.j = 2;
        subOb.k = 3;
        System.out.println("Content of subOb:");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i, j, k in subOb is:");
        subOb.sum();

    }

}
