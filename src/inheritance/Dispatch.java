package inheritance;

/**
 * Method overriding forms the basic of the Java's most powerful concepts: dynamic method dispatch.
 * Dynamic method dispatch is the mechanism by which a call to an overriding method is resolved
 * at run time, rather than compile time. Dynamic method dispatch is important because this is how
 * Java implements run-time polymorphism.
 */

class ClassA {

    void callMe() {
        System.out.println("Inside A class method");
    }
}

class ClassB extends ClassA{

    void callMe() {
        System.out.println("Inside B class method");
    }
}


class ClassC extends ClassA {

    void callMe() {
        System.out.println("Inside C class method");
    }
}

public class Dispatch {

    public static void main(String[] args) {

        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        ClassA ref; // obtain a reference of type classA

        ref = a; // ref refers to an ClassA object
        ref.callMe(); // calls ClassA's version of callMe

        ref = b;
        ref.callMe();

        ref = c;
        ref.callMe();

    }

}
