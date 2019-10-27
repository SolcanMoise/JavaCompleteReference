package lang_package;

/**
 * The java.lang.Byte class wraps a value of primitive type byte in an object. An object of type Byte contains a
 * single field whose type is byte.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-10-27
 */
public class ByteClassExample {

    private Byte firstByte;
    private Byte secondByte;
    private Byte thirdByte;

    private void initialize() {
        byte value = 10;
        firstByte = new Byte(value);
        secondByte = new Byte("-10");
        thirdByte = new Byte("127");
    }

    private void getFieldsOfByteClass() {
        System.out.println("Max value is: " + Byte.MIN_VALUE);
        System.out.println("Min value is:" + Byte.MAX_VALUE);
        System.out.println("Size is: " + Byte.SIZE);
        System.out.println("Number of bytes: " + Byte.BYTES);
    }

    public static void main(String[] args) {
        ByteClassExample classExample = new ByteClassExample();
        classExample.initialize();
        classExample.getFieldsOfByteClass();
    }
}
