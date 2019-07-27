package other_topics;

import java.io.*;

/**
 * Java program to demonstrate the transient keyword.
 * OBS: There's no impact of using static or final keyword with transient.
 *
 * @author solcanm
 * @date 2019-07-27
 */
public class TransientTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TransientKeyword input = createTransientObject();

        // serialization
        FileOutputStream fos =  new FileOutputStream("src/other_topics/transient");
        ObjectOutputStream ous = new ObjectOutputStream(fos);
        ous.writeObject(input);

        // de-serialization
        FileInputStream fis = new FileInputStream("src/other_topics/transient");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TransientKeyword output = (TransientKeyword) ois.readObject();
        System.out.println(output);
    }

    private static TransientKeyword createTransientObject() {
        TransientKeyword obj = new TransientKeyword();
        obj.setAge(10);
        obj.setEmail("email@yahoo.com");
        obj.setUsername("username");
        obj.setPassword("password");
        return obj;
    }
}
