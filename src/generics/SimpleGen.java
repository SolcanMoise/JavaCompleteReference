package generics;

/**
 * Demonstrate ToGen.
 *
 * @author solcanm
 * @date 2019-07-31
 */
public class SimpleGen {

    public static void main(String[] args) {

        TwoGen<Integer, String> twoGen = new TwoGen<>(10, "Ten");
        twoGen.showTypes();
        int t = twoGen.getOb1();
        System.out.println("Value of T is: " + t);

        String v = twoGen.getOb2();
        System.out.println("Value of V is: " + v);
    }
}

class TwoGen<T, V> {

    private T ob1;
    private V ob2;

    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showTypes() {
        System.out.println("Type of T is: " + ob1.getClass().getSimpleName());
        System.out.println("Type of V is: " + ob2.getClass().getSimpleName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}
