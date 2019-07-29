package generics;

/**
 * At its core, the term generics means parametrized types.
 *
 * @author solcanm
 * @date 2019-07-29
 */
public class GenDemo {

    public static void main(String[] args) {
        // create a Gen reference for Integers
        Gen<Integer> iOb;

        /*
        Create a Gen<Integer> object and assign its reference to iOb.
        Notice the use of autoboxing to encapsulate the value 88 within
        an Integer object.
         */
        iOb = new Gen<>(88);

        // show the type of data used by iOb.
        iOb.showType();

        // get the value in iOb.
        System.out.println("Value of iOb is: " + iOb.getOb());

        System.out.println();

        // create a Gen object for Strings.
        Gen<String> strOb = new Gen<>("Value");

        // show the type of data used by strOb
        strOb.showType();

        // get the value of strOb. Notice that no cast is needed.
        String str = strOb.getOb();
        System.out.println("Value of strOb is : " + str);
    }
}

/**
 * A simple generic class.
 * @param <T> type parameter that will be replaced by a real type when an object of type Gen is created
 */
class Gen<T> {

    private T ob; // declare an object of type T

    // pass the constructor a reference to an object of type T
    Gen(T ob) {
        this.ob = ob;
    }

    // return object
    T getOb() {
        return ob;
    }

    // show type of T
    void showType() {
        System.out.println("Type of T is : " + ob.getClass().getName());
    }
}
