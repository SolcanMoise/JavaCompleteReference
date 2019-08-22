package strings;

import java.util.Objects;

/**
 * A simple class that override toString() method.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-22
 */
public class Box {

    private double width;
    private double height;
    private double depth;

    public double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.width, width) == 0 &&
                Double.compare(box.height, height) == 0 &&
                Double.compare(box.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, depth);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box{");
        sb.append("width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", depth=").append(depth);
        sb.append('}');
        return sb.toString();
    }
}

class BoxTest {

    public static void main(String[] args) {
        Box box = new Box();
        box.setWidth(2);
        box.setHeight(3);
        box.setDepth(4);
        System.out.println(box);
    }
}
