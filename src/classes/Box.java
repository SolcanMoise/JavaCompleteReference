package classes;

/**
 * Simple class example
 */
public class Box {

    double width;
    double height;
    double depth;

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

        // compute volume of box
        double volume;
        volume = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume is " + volume);


    }

}
