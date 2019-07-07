package threads;

class ThreadN implements Runnable{
    Thread t;
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
        ThreadN ob1 = new ThreadN("One");
        ThreadN ob2 = new ThreadN("Two");
        ThreadN ob3 = new ThreadN("Three");

        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());

        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());

        System.out.println("Main thread exiting");
    }
}
