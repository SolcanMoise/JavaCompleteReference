package threads;

/**
 * Using suspend and resume
 */
public class SuspendResume {

    public static void main(String[] args) {
        NewThr newThr1 = new NewThr("One");
        NewThr newThr2 = new NewThr("Two");

        try {
            Thread.sleep(1000);
            newThr1.t.suspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            newThr1.t.resume();
            System.out.println("Resuming thread One");

            newThr2.t.suspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            newThr2.t.resume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        try {
            System.out.println("Wait for threads to finish");
            newThr1.t.join();
            newThr2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }

}

class NewThr implements Runnable {

    String name; // name of the thread
    Thread t;

    public NewThr(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread: " + name);
        t.start(); // start the thread
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
        System.out.println(name + " exiting");
    }
}
