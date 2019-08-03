package generics;

/**
 * Demonstrate a simple generic method
 *
 * @author solcanm
 * @date 2019-08-03
 */
public class GenMethDemo {

    // Determine if an object is in an array
    private static <T, V extends T> boolean isIn(T x, V[] y) {
        for (V v : y) {
            if (x.equals(v))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Use isIn() on  Integers
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums))
            System.out.println("2 is in nums");

        // Use isIn() on Strings
        String[] strings = {"ab", "bc", "cd", "de"};
        if (isIn("ab", strings))
            System.out.println("ab is in strings");
    }
}
