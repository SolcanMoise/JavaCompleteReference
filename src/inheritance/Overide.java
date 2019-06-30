package inheritance;

/**
 * In a class hierarchy, when a method in a subclass has the same name ant type signature as a
 * method on its superclass, then the method in the subclass is said to override the method
 * in the superclass. When an overridden method is called from within a subclass, it will always
 * refer to the version of that method defined by the subclass. The version of the method
 * defined in superclass will be hidden.
 */

class SuperClass {

    int i, j;

    SuperClass(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " +i + " " + j);
    }

}

class SubClass extends SuperClass {

    int k;

    SubClass(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    // this overrides show() in SuperClass
    void show() {
        System.out.println("i, j, k: " + i + ", " +j + ", " + k);
    }

}

public class Overide {

    public static void main(String[] args) {

        SuperClass superClass = new SuperClass(2, 3);
        superClass.show();

        SubClass subClass = new SubClass(4, 5, 6);
        subClass.show();

    }

}
