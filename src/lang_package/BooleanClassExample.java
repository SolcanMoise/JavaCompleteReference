package lang_package;

/**
 * The java.lang.Boolean lass wraps a value of the primitive type boolean in an object.
 * An object of type Boolean contains a single field whose type is boolean.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-10-27
 */
public class BooleanClassExample {

    private Boolean isFirst;
    private Boolean isSecond;
    private Boolean isThird;

    private void initialize() {
        boolean firstValue = true;
        String secondValue = "false";
        String thirdValue = "value";
        isFirst = new Boolean(firstValue);
        isSecond = new Boolean(secondValue);
        isThird = new Boolean(thirdValue);
    }

    private void afisareValoare() {
        System.out.println("isFirst = " + isFirst);
        System.out.println("isSecond = " + isSecond);
        System.out.println("isThird = " + isThird);
    }

    private void booleanFieldsDisplay() {
        boolean trueValue = Boolean.TRUE.booleanValue();
        boolean falseValue = Boolean.FALSE.booleanValue();
        System.out.println("Fields is TRUE and FALSE");
    }

    private void getHashValue() {
        System.out.println(isFirst.hashCode()); // 1231
        System.out.println(isSecond.hashCode()); // 1237
        System.out.println(isThird.hashCode()); // 1237
    }

    public static void main(String[] args) {
        BooleanClassExample classExample = new BooleanClassExample();
        classExample.initialize();
        classExample.afisareValoare();
        classExample.booleanFieldsDisplay();
        classExample.getHashValue();
    }
}
