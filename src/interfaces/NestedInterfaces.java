package interfaces;

class A {

    // this is a nested interface
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// B implements the nested interface
class B implements A.NestedIF {

    @Override
    public boolean isNotNegative(int x) {
        return x >= 0;
    }
}

public class NestedInterfaces {

    public static void main(String[] args) {

        // use a nested interface reference
        A.NestedIF nestedIF = new B();

        if(nestedIF.isNotNegative(10)) {
            System.out.println("10 is not negative");
        }
        if(nestedIF.isNotNegative(-10)) {
            System.out.println("This won't be displayed");
        }
    }

}
