package threads;

class ThreadN implements Runnable{
    private Thread t;
    private String name;

    ThreadN(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread" + t);
        t.start();
    }

    // this is the entry point for the second thread
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
        System.out.println(name + " exiting");
    }
}

/**
 * Creating multiple threads
 */
public class Threads {

    public static void main(String[] args) {
        new ThreadN("One");
        new ThreadN("Two");
        new ThreadN("Three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exiting");
    }
}
