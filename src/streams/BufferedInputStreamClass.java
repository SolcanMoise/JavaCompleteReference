package streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Java BufferedInputStream class is used to read information from stream.
 * It internally uses buffer mechanism to make the performance fast.
 * The important points about BufferedInputStream are:
 *      - When the bytes from the stream are skipped or read,
 *        the internal buffer automatically refilled from the contained input stream, many bytes at a time.
 *      - When a BufferedInputStream is created, an internal buffer array is created.
 */
public class BufferedInputStreamClass {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/streams/output.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int i;
        while((i = bufferedInputStream.read()) != -1) {
            System.out.print((char)i);
        }
    }
}
