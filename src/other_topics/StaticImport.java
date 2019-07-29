package other_topics;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

/**
 * JDK 5 added a new feature to Java called static import that expands the capabilities of the import
 * keyword. By following import with the keyword static, an import statement can be used to import static
 * members of a class or interface. When using static import, it is possible to refer to static members
 * directly by their names, without having to qualify them with the name of their class.
 *
 * @author solcanm
 * @date 2019-07-29
 */


public class StaticImport {

    public static void main(String[] args) {

        Hypotenuse ob = new Hypotenuse();
        ob.setC1(3);
        ob.setC2(4);
        System.out.println("Hypotenuse is : " + ob.calculateHypotenuse());
    }
}

class Hypotenuse {
    private double c1;
    private double c2;
    private double h;

    public double getC1() {
        return c1;
    }

    void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    void setC2(double c2) {
        this.c2 = c2;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    double calculateHypotenuse() {
        return sqrt(pow(c1, 2) + pow(c2, 2));
    }
}
