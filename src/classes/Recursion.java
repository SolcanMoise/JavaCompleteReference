package classes;

/**
 * Java supports recursion. Recursion is the process of defining something in terms of itself.
 * As it relates to Java programming, recursion is the attribute that allows a method to call
 * itself. A method that calls itself is said to be recursive.
 */

class Factorial {

    int fact(int a) {

        int result;

        if(a == 1) {
            return 1;
        }
        result = a * fact(a-1);
        return result;

    }

}

public class Recursion {

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial of 10 is: " + f.fact(10));
    }

}
