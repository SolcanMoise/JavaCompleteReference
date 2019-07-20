package streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Java FileInputStream class obtains input bytes from a file.
 */
public class FileInputStreamClass {

    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("src/streams/outputStream.txt");
            // estimated number of bytes that can be read from the input stream.
            int availableBytes = inputStream.available();
            int readByte = 0;
            while((readByte = inputStream.read()) != -1) {
                System.out.print((char)readByte);
            }
        } catch (IOException e) {
            System.err.println("File not found.");
        }
    }
}
