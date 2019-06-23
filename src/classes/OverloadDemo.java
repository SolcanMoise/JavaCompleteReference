package classes;

/**
 * Demonstrate method overloading
 * Method overloading is one of the ways that Java supports Polymorphism.
 */
public class OverloadDemo {

    void test() {
        System.out.println("No parameters");
    }

    // Overload test for one integer parameter
    void test(int a) {
        System.out.println("a = " + a);
    }

    // Overload test for two integer parametars
    void test(int a, int b) {
        System.out.println("a = " + a + " and b = " + b);
    }

    double test(double a) {
        System.out.println("Double value a = " + a);
        return a * a;
    }

}

class Test {

    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();

        od.test();
        od.test(2);
        od.test(4, 5);
        od.test(5.9);
    }

}
