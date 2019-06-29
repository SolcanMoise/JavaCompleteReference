package classes;

/**
 * There will be times when you will want to define a class member that will be used independently of any object
 * of that class. To create such a member, precede its declaration with the keyword static.
 * Methods declared static have several restrictions:
 *  - they can only call other static methods
 *  - they must only access static data
 *  - they cannot refer to this or super in any way.
 */
class UseStatic {

    private static int a = 3;
    private static int b;

    static void showData(int c) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    static {
        System.out.println("Static block initialized");
        b = a * 2;
    }

}

class StaticByName {

    public static void main(String[] args) {
        UseStatic.showData(9);
    }

}