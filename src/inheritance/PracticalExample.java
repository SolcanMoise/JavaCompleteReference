package inheritance;

/**
 * Let's look at more practical example that will help illustrate the power of inheritance.
 */

class Box {

    double width;
    double height;
    double depth;

    // construct clone of an object
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when no dimensions specified
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when all dimensions are specified
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // constructor used when cube is created
    Box(double length) {
        width = height = depth = length;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

}

/**
 * Here, Box is extended to include weight
 */
class BoxWeight extends Box {

    double weight;

    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth); // call superclass constructor
        this.weight = weight;
    }

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double length, double weight) {
        super(length);
        this.weight = weight;
    }

}


public class PracticalExample {

    public static void main(String[] args) {

        BoxWeight myBox1 = new BoxWeight(2,3,4, 5);
        System.out.println("Volume of myBox1 is: " + myBox1.volume());

    }

}
