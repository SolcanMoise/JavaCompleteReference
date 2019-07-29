package other_topics;

/**
 * When working with overloaded constructors, it is sometimes useful for one constructor to invoke
 * another. In Java, this is accomplished by using another form of the this keyword.
 *
 * @author solcanm
 * @date 2019-07-29
 */
public class InvokingOverloadedConstructors {

    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        System.out.println(c1);

        MyClass c2 = new MyClass(5);
        System.out.println(c2);

        MyClass c3 = new MyClass(7, 9);
        System.out.println(c3);
    }
}

class MyClass {

    private int a;
    private int b;

    // give a and b default values of o
    MyClass() {
        this(0);
    }

    // initialize a and b to the same value
    MyClass(int i) {
        this(i, i);
    }

    // initialize a and b individually
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyClass{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append('}');
        return sb.toString();
    }
}
