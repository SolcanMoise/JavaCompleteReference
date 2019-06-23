package classes;

/**
 * Simple class example
 */
public class Box {

    double width;
    double height;
    double depth;

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
        myBox = new Box(); // allocate a box object
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // create a new Object of type Box
        Box newBox = new Box();
        newBox.width = 3;
        newBox.height = 6;
        newBox.depth = 9;

        // compute volume of first object
        double myObjVol = myBox.volume();
        System.out.println("Volume of myBox = "+ myObjVol);

        // compute volume for the second object
        myObjVol = newBox.volume();
        System.out.println("Volume of newBox = "+ myObjVol);
    }

}
