package inheritance;

/**
 * Sometimes you will want to create a superclass that only defines a generalized form of that
 * will be shared by all of its subclasses, leaving it to each subclass to fill in the details.
 */

abstract class Car {

    abstract void goForward();

    // concrete methods are still allowed in abstract classes
    void goBackward() {
        System.out.println("This is a concrete methods");
    }

}

class Bus extends Car {
    
    @Override
    void goForward() {
        System.out.println("Bus's implementation of goForward.");
    }
}

public class Abstract {

    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.goForward();
        bus.goBackward();

    }

}
