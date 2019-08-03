package generics;

/**
 * A generic interface example
 *
 * @author solcanm
 * @date 2019-08-03
 */
public class GenInterfaceDemo {

    public static void main(String[] args) {
        Integer[] integers = {2, 5, 1, 9, -2, -5};

        MyClass<Integer> myClass = new MyClass<>(integers);
        System.out.println("Min is: " + myClass.min());
        System.out.println("max is: " + myClass.max());
    }
}

// A Min/Max interface
interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

// Now, implements MinMax
class MyClass<T extends Comparable<T>> implements MinMax<T> {

    private T[] vals;

    public MyClass(T[] vals) {
        this.vals = vals;
    }

    @Override
    public T min() {
        T min = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(min) < 0) {
                min = vals[i];
            }
        }
        return min;
    }

    @Override
    public T max() {
        T max = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(max) > 0) {
                max = vals[i];
            }
        }
        return max;
    }
}
