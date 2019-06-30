package interfaces;

public class Client implements Callback {

    /*
        When you implement an interface method, it must be declared as public.
     */
    @Override
    public void callback(int param) {
        System.out.println("Callback called with: " + param);
    }

    void nonifaceMeth() {
        System.out.println("Class that implement interfaces may also define other members, too!");
    }
}

class TestClient {

    /**
     * The following example calls the callback method via an interface reference variable.
     * @param args
     */
    public static void main(String[] args) {
        Callback client = new Client();
        client.callback(3);
    }

}
