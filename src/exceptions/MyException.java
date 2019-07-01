package exceptions;

/**
 * Create a custom exception
 */
public class MyException extends Exception {

    int detail;

    public MyException(int a) {
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException[" + detail + "]";
    }
}

class TestExecption {

    static void compute(int x) throws MyException {
        if(x > 10) {
            throw new MyException(x);
        }
        System.out.println("Normal exit");

    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);

        } catch (MyException e) {
            System.out.println("Caught: " + e);
        }
    }

}
