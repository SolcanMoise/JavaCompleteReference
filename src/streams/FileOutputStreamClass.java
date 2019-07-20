package streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Java FileOutputStream is an output stream used for writing data to a file.
 */
public class FileOutputStreamClass {

    public static void main(String[] args) {
        try {
            Car car = new Car().setMakes("Jaguar").setModel("XF").setColor("red").setTransmission("Automatic");
            OutputStream outputStream = new FileOutputStream("src/streams/outputStream.txt");
            byte[] carStream = car.toString().getBytes(); // convert to byte
            outputStream.write(carStream);
            outputStream.close();
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }
}
