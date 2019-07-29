package generics;

/**
 * Demonstrate the non-generic class.
 *
 * @author solcanm
 * @date 2019-07-29
 */
public class NonGenDemo {

    public static void main(String[] args) {
        NonGen iOb;

        // create a NonGen Object and store an Integer in it. Autoboxing will occurs.
        iOb = new NonGen(88);

        // show the data used by iOb
        iOb.showType();

        // get The value of iOb. This time a cast is necessary.
        int v = (int) iOb.getOb();
        System.out.println("Value of iOb is : " + v);

        System.out.println();

        // create another NonGen object and store a String in it.
        NonGen strOb = new NonGen("Non-Generics");

        // show the type of the data used by strOb
        strOb.showType();

        // get the value of strOb
        String str = (String) strOb.getOb();
        System.out.println("Value of strOb is : " + str);

        // This compile, but is conceptually wrong.
        iOb = strOb;
        v = (int) iOb.getOb(); // run-time error!!
    }
}

/**
 * NonGen is functionally equivalent to {@link generics.Gen} but does not use generics.
 */
class NonGen {

    private Object ob; // ob is now of type Object

    // Pass the constructor a reference to an object of type Object.
    NonGen(Object ob) {
        this.ob = ob;
    }

    // return type Object
    Object getOb() {
        return ob;
    }

    // show type of ob
    void showType() {
        System.out.println("Type of ob is : " + ob.getClass().getName());
    }
}
