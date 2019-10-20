package strings;

/**
 * A bubble sort for Strings
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-10-20
 */
public class BubbleSort {

    private static String[] arr = {
            "Now", "is", "the", "time", "for", "all", "good", "men",
            "to", "come", "to", "the", "aid", "of", "their", "country"
    };

    private static String[] sort(String... values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[j].compareTo(values[i]) < 0) {
                    String aux = values[i];
                    values[i] = values[j];
                    values[j] = aux;
                }
            }
        }
        return values;
    }

    private static void display(String... values) {
        for (String value : values) {
            System.out.println(value + " ");
        }
    }

    public static void main(String[] args) {
        display(sort(arr));
    }
}
