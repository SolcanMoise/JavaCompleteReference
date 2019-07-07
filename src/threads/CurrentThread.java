package threads;

/**
 * Controlling the main Thread
 */
public class CurrentThread {

    public static void main(String[] args) {

        // the main thread is created automatically when your program is started.
        Thread t = Thread.currentThread(); // obtain reference to main thread

        System.out.println("Current Thread: " + t);

        // change the name of the thread
        t.setName("My thread");
        System.out.println("After name change: " + t);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000); // suspend thread for 1 sec
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Terminate execution");
    }

}
