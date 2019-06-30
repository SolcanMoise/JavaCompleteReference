package inheritance;

/**
 * Polymorphism is essential to OOP for one reason: it allows a general class to specify methods
 * that will be common to all of its derivatives, while allowing subclasses to define specific
 * implementation of some or all of those methods. Overridden methods are another way that Java
 * implements the 'one interface, multiple methods' aspect of polymorphism.
 */

// Using run-time polymorphism
class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area for figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {

    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for Triangle");
        return dim1 * dim2 / 2;
    }
}


public class Polymorphism {

    public static void main(String[] args) {

        Figure figure = new Figure(1, 2);
        Rectangle rectangle = new Rectangle(3,4);
        Triangle triangle = new Triangle(5,6);

        Figure figureRef;

        figureRef = figure;
        System.out.println("Area is : " + figureRef.area());

        figureRef = rectangle;
        System.out.println("Area is : " + figureRef.area());

        figureRef = triangle;
        System.out.println("Area is : " + figureRef.area());

    }

}
