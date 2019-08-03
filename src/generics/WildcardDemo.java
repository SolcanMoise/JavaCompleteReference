package generics;

/**
 * @author solcanm
 * @date 2019-08-03
 */
public class WildcardDemo {

    public static void main(String[] args) {

        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(inums);
        double v = iOb.average();
        System.out.println("iOb average is:" + v);

        Double[] dnums = {1.2, 2.4, 3.5, 4.7, 5.9};
        Stats<Double> dOb = new Stats<>(dnums);
        double w = dOb.average();
        System.out.println("dOb average is: " + w);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fOb = new Stats<>(fnums);
        double z = fOb.average();
        System.out.println("fOb average is: " + z);

        // See which arrays have same average.
        if(iOb.sameAvg(dOb))
            System.out.println("Average of iOb and dOb are the same");
        else if (iOb.sameAvg(fOb))
            System.out.println("Average of iOb and fOb are the same");
        else if (dOb.sameAvg(fOb)) {
            System.out.println("Average of dOb and fOb are the same");
        } else {
            System.out.println("Averages are different");
        }
    }
}
