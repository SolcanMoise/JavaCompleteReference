package streams;

import java.io.*;

/**
 * Java BufferedOutputStream class is used for buffering an output stream.
 * It internally used buffer to store data. It adds more efficiency than to write data
 * directly into a stream. So, it make the performance fast.
 */
public class BufferedOutputStreamClass {

    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("src/streams/output.txt");
        // creates the new buffered output stream which is used for writing the data to the specified output stream.
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        String message = "BufferedOutputStream.";
        byte[] messageInBytes = message.getBytes();
        // writes the specified byte to the buffered output stream.
        bufferedOutputStream.write(messageInBytes);
        // flushes the buffered output stream.
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        outputStream.close();
    }
}
