package strings;

/**
 * StringBuffer is a peer class of String that provides much of the functionality of
 * strings. StringBuffer represents growable and writeable character sequences.
 * StringBuffer allocates room for 16 additional characters when no specific buffer
 * length is requested, because reallocation is a costly process in terms of time.
 * Also, frequent reallocations can fragment the memory.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-10-26
 */
public class StringBufferClass {

    public static void main(String[] args) {
        String hello = "HELLO";

        StringBuffer stringBuffer = new StringBuffer(hello);

        int length = stringBuffer.length();
        int capacity = stringBuffer.capacity(); // 21, because room for 16 additional characters is automatically added

        String helloLength = stringBuffer.insert(0, "Length(").append(") = ").append(length).toString();
        String helloCapacity = stringBuffer.delete(0, 7).insert(0, "Capacity(").delete(14, 19)
                .append(") = ").append(capacity).toString();

        System.out.println(helloLength);
        System.out.println(helloCapacity);

        String helloWorld = stringBuffer.replace(0, 9, "").delete(5, 11).append(" WORLD!").toString();
        System.out.println(helloWorld);
    }
}
