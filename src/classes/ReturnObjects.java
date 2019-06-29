package classes;

/**
 * A method can return any type of data, including class type that you create.
 */
public class ReturnObjects {

    public static void main(String[] args) {
        Example ex1 = new Example(2);
        Example ex2 = ex1.incrementByTen();

        System.out.println("Obj1 has a = " + ex1.getA());
        System.out.println("Obj2 has a = " + ex2.getA());
    }

}


// Example of a class that contains a method which return an object of the class
class Example {

    private int a;

    Example(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    Example incrementByTen() {
        Example ex = new Example(a+10);
        return ex;
    }
}