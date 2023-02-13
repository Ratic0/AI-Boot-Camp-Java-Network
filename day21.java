import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class day21 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.inha.ac.kr");
            URLConnection urlConnection = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream())); // br 에 html 정보가 모두 담겨있음
            String line;
            while ((line = br.readLine()) != null) { // 한줄 한줄씩 꺼내서 읽기
                System.out.println(line);
            }
            br.close();
        }catch (MalformedURLException e){
            throw new RuntimeException(e);
        }catch (IOException ex) {
            System.out.println("test");
            // Handle exception
        }
    }
}
