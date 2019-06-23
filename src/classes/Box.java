package classes;

/**
 * Simple class example
 */
public class Box {

    double width;
    double height;
    double depth;

    // define a constructor
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

/**
 * This class declares an object of type Box
 */
class BoxDemo {

    public static void main(String[] args) {
        Box myBox; // declare reference to object
        myBox = new Box(10, 20, 15); // allocate a box object

        // create a new Object of type Box
        Box newBox = new Box(3, 6, 9);

        // compute volume of first object
        double myObjVol = myBox.volume();
        System.out.println("Volume of myBox = "+ myObjVol);

        // compute volume for the second object
        myObjVol = newBox.volume();
        System.out.println("Volume of newBox = "+ myObjVol);
    }

}
