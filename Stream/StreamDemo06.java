package Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// 폴더(디렉토리)로부터 스트림 객체 생성
public class StreamDemo06 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("D:/NETWORK_JAVA/Stream");
            Stream<Path> pathStream = Files.list(path);
            pathStream.forEach(p-> System.out.println(p.getFileName()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
