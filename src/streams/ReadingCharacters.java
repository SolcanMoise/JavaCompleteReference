package streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Use a BufferReader to read characters from the console.
 * @author solcanm
 * @date 2019-07-23
 */
public class ReadingCharacters {

    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");

        // read characters
        do {
            c = (char) buffer.read();
            System.out.println(c);
        }while (c != 'q');
    }
}
