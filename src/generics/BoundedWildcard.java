package generics;

/**
 * Demonstrate a bounded wildcard
 *
 * @author solcanm
 * @date 2019-08-03
 */
public class BoundedWildcard {

    private static void showXY(Coords<?> coords) {
        System.out.println("X Y");
        for (int i = 0; i < coords.getCoords().length; i++) {
            int valueOfX = coords.getCoords()[i].getX();
            int valueOfY = coords.getCoords()[i].getY();
            System.out.println("Values of x and y are: " + valueOfX + ", " + valueOfY);
        }
    }

    private static void showXYZ(Coords<? extends ThreeD> coords) {
        System.out.println("X Y Z");
        for (int i = 0; i < coords.getCoords().length; i++) {
            int valueOfX = coords.getCoords()[i].getX();
            int valueOfY = coords.getCoords()[i].getY();
            int valueOfZ = coords.getCoords()[i].getZ();
            System.out.println("Values of x and y are: " + valueOfX + ", " + valueOfY + ", " + valueOfZ);
        }
    }

    public static void main(String[] args) {
        TwoD[] twoD = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23)
        };

        Coords<TwoD> twoDCoords = new Coords<>(twoD);
        showXY(twoDCoords);


        ThreeD[] threeDs = {
                new ThreeD(0, 0, 0),
                new ThreeD(2, 5, 7),
                new ThreeD(-1, -5, -2)
        };

        Coords<ThreeD> threeDCoords = new Coords<>(threeDs);
        showXY(threeDCoords); // this work as well
        showXYZ(threeDCoords);
    }
}

// Two-dimensional coordinates
class TwoD {
    private int x, y;

    TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}

// Three-dimensional coordinates
class ThreeD extends TwoD {
    private int z;

    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    int getZ() {
        return z;
    }
}

// Four dimensional coordinates
class FourD extends ThreeD {
    private int t;

    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }

    public int getT() {
        return t;
    }
}

// This class holds an array of coordinate objects
class Coords<T extends TwoD> {
    private T[] coords;

    Coords(T[] coords) {
        this.coords = coords;
    }

    T[] getCoords() {
        return coords;
    }
}
