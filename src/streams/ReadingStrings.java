package streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Read a string from console using BufferReader.
 * @author solcanm
 * @date 2019-07-23
 */
public class ReadingStrings {

    public static void main(String[] args) {
        try {
            List<String> words = ReadFromConsole.read();
            System.out.println(words);
        } catch (IOException e) {
            System.err.println("Unable to read from console");
        }
    }
}

class ReadFromConsole{


    /**
     * read strings from console and store them into a list
     * @return a list of strings
     */
    static List<String> read() throws IOException {
        String s;
        List<String> list = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
           s = reader.readLine();
           list.add(s);
        } while (!s.equals("stop"));
        return list;
    }
}
