package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamDemo07 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("D:/NETWORK_JAVA/Stream/java.txt");
            Stream<String> st;
            // Files 클래스의 line()
            st = Files.lines(path, Charset.defaultCharset());
            st.forEach(System.out::println);
            // BufferedReadder 클래스의 lines ()
            File file = path.toFile();
            FileReader fileReader = new FileReader((file));
            BufferedReader br = new BufferedReader(fileReader);
            st = br.lines();
            st.forEach(System.out::println);

        } catch (IOException e) {
        }
    }
}
