package generics;

/**
 * Example to show you how to limit the types that can be passed to a type parameter.
 *
 * @author solcanm
 * @date 2019-07-31
 */

public class BoundsDemo {

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        Stats<Integer> stats = new Stats<>(nums);
        System.out.println(stats.average());
    }
}

class Stats<T extends Number> {

    private T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }

    double average() {

        double sum = 0.0;
        for (T num : nums) {
            sum += num.doubleValue();
        }

        return sum / nums.length;
    }
}
