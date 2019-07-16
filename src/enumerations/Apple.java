package enumerations;

/**
 * An enumeration of apple varieties.
 */
public enum Apple {
    Jonatan(7), GoldenDel, RedDel, Winesap(10), Cortland;

    private int price; // hold price for each variety od apple

    // constructor, which is used to pass the price for an apple
    Apple(int price) {
        this.price = price;
    }

    Apple() {
        price = -1;
    }

    // return the value of price
    public int getPrice() {
        return price;
    }
}

class EnumDemo {

    public static void main(String[] args) {

        Apple ap;

        // get list of all Apple enum constants
        Apple all[] = Apple.values();
        for (Apple a:all) {
            System.out.println("List: " + a);
        }

        ap = Apple.valueOf("Jonatan");

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

        // display price of Jonatan and RedDel apples
        System.out.println("Jonatan cost: " + Apple.Jonatan.getPrice());
        System.out.println("RedDel cost: " + Apple.RedDel.getPrice());

    }

}