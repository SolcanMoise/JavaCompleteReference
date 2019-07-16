package enumerations;

/**
 * An enumeration of apple varieties.
 */
public enum Apple {
    Jonatan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {

    public static void main(String[] args) {

        Apple ap;

        ap = Apple.Jonatan;

        // output an enum value
        System.out.println("Value of ap is: " + ap);

        ap = Apple.GoldenDel;

        // compare two enum value
        if(ap == Apple.GoldenDel) {
            System.out.println("ap contains GoldenDel");
        }

        // Use an enum to control a switch statement
        switch (ap) {
            case RedDel:
                System.out.println("ap is RedDel");break;
            case Jonatan:
                System.out.println("ap is Jonatan");break;
            default:
                System.out.println("ap is something else");
        }

    }

}