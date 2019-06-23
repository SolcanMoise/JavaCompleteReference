package classes;

/**
 * Objects may be passed to methods
 */
public class ObjectParameters {

    int a, b;

    ObjectParameters(int i, int j) {
        a = i;
        b = j;
    }

    /**
     * Test if two objects is equal
     * @param o the object to be compared
     * @return true if o is equal to the invoking object
     */
    boolean equals(ObjectParameters o) {
        if(o.a == a && o.b == b){
            return true;
        }
        return false;
    }

}

class ObjectParametersTest {

    public static void main(String[] args) {
        ObjectParameters op1 = new ObjectParameters(10, 20);
        ObjectParameters op2 = op1; // copy reference of op1 to op2
        ObjectParameters op3 = new ObjectParameters(2, 4);

        System.out.println("op1 is equal to op2: " + op1.equals(op2));
        System.out.println("op2 is equal to op3: " + op2.equals(op3));

    }

}
