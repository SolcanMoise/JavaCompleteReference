package threads;


/**
 * A correct implementation of a producer and consumer.
 */
public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Q q = new Q();

        new Producer(q);
        new Consumer(q);

    }

}

class Q {

    int n;
    boolean valueSet = false;

    synchronized int get() {
        while(!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = false;
        System.out.println("Got:" + n);
        notify();
        return n;
    }

    synchronized void put(int n) {
        while(valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }

}

class Producer implements Runnable{

    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {

    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while(true) {
            q.get();
        }
    }
}