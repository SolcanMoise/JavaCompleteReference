package strings;

/**
 * The String class support multiple constructors.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-22
 */
public class StringConstructors {
    public static void main(String[] args) {

        // create an empty String
        String value = new String();
        System.out.println(value);

        // create Strings that have initial value
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        String abcde = new String(chars);
        String abc = new String(chars, 0, 3);
        String abcdeCopy = new String(abcde);
        System.out.println(abcde);
        System.out.println(abc);
        System.out.println(abcdeCopy);

        // construct Strings from subset of char array
        byte[] ascii = {65, 66, 65};
        String asciiString = new String(ascii);
        System.out.println(asciiString);
    }
}
