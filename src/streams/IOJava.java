package streams;

import java.io.IOException;

/**
 * Java I/O is used to process the input and produce the output.
 * Java uses the concept of streams to make I/O operations fast.
 * A stream is a sequence of data. In Java a stream is composed of bytes.
 * In Java, 3 streams are created for us automatically. All these streams are attached with the console.
 *      - System.out = standard output stream
 *      - System.in = standard input stream
 *      - System.err = standard error stream
 */
public class IOJava {

    public static void main(String[] args) {
        int x = 0;
        try {
            x = System.in.read(); // input
        } catch (IOException e) {
            System.err.println("Error at reading!"); // error
        }
        System.out.println(x); // output
    }
}
