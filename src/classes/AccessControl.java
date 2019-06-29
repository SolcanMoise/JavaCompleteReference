package classes;

/**
 * This program demonstrate the difference between public and private.
 */

class Access {

    int x; // default access
    public int y; // public access
    private int z; // private access

    // method to get z value
    public int getZ() {
        return z;
    }

    // method to set z value
    public void setZ(int z) {
        this.z = z;
    }
}

public class AccessControl {

    public static void main(String[] args) {

        Access access = new Access();

        // these are ok, x and y can be accessed directly
        access.x = 3;
        access.y = 6;
        // these is not ok, and will cause an error
        // access.z = 9;

        // you must access z through its methods
        access.setZ(9);

        // print access values
        System.out.println("Access values:");
        System.out.println("x = " + access.x);
        System.out.println("y = " + access.y);
        System.out.println("z = " + access.getZ());

    }

}
