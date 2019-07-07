package threads;

/**
 * Create a new thread by implementing the Runnable interface
 */
public class NewThread implements Runnable{
    Thread t;

    NewThread() {
        t = new Thread(this, "Child thread");
        System.out.println("Child thread: " + t);
        t.start();
    }

    // this is the entry point for the second thread
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Child interrupted");
            }
        }
        System.out.println("Child thread exiting");
    }
}

class TestNewThread {

    public static void main(String[] args) {
        System.out.println("Main thread: " + Thread.currentThread());
        new NewThread(); // create a new thread

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread exiting");
    }

}