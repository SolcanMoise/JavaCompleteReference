package other_topics;

/**
 * InstanceOf operator is used in Java to find the type of an object during runtime.
 *
 * @author solcanm
 * @date 2019-07-29
 */
public class InstanceOF {

    public static void main(String[] args) {
        A a = new A();
        B b =  new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) { // true
            System.out.println("a is instance of A");
        }

        if (c instanceof A) { // true
            System.out.println("c can be cast to A");
        }

        if(a instanceof C) { // false
            System.out.println("a can be cast to C");
        } else {
            System.out.println("a cannot be cast to C");
        }
    }
}

class A {

    int i, j;
}

class B {

    int i, j;
}

class C extends A {

    int k;
}

class D extends B {

    int k;
}
