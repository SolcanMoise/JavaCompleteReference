package generics;

/**
 * Use a generic constructor
 *
 * @author solcanm
 * @date 2019-08-03
 */
public class GenConsDemo {

    public static void main(String[] args) {
        GenCons cons = new GenCons(100);
        GenCons cons1 = new GenCons(123.5F);

        System.out.println("Value of cons is: " + cons.getVal());
        System.out.println("Value of cons1 is:" + cons1.getVal());
    }
}

class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    double getVal() {
        return val;
    }
}
