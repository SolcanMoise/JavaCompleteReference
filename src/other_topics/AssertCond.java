package other_topics;

/**
 * Assert is used during program development to create an assertion, which is a condition that should be true
 * during the execution of the program.
 *
 * @author solcanm
 * @date 2019-07-29
 */
public class AssertCond {

    static int x = 3;

    static int getnum() {
        return x--;
    }

    public static void main(String[] args) {

        int n;

        for (int i = 0; i < 10; i++) {
            n = getnum();
            assert n > 0; // will fail when n equals to 0
            System.out.println("n = " + n);
        }
    }
}
