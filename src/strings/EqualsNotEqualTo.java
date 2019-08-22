package strings;

/**
 * The main difference between equals() and ==
 * The equals() method compares the characters inside a String object. The == operator
 * compares two object references to see whether they refer to same object.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-22
 */
public class EqualsNotEqualTo {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = s1;
        System.out.println(s1 + " equals() to " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
    }
}
