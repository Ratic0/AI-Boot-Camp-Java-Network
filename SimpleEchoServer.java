import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleEchoServer {
    public static void main(String[] args) {
        System.out.println("에코 서버 시작됨");
        try (ServerSocket serverSocket = new ServerSocket(6000)) {
            System.out.println("연결 대기중...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("클라이언트 연결완료");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); //입출력 송수신 버퍼 거치고 거쳐서 br에 담겨 try()를 통해 .close()를 할 필요가 없음
                PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true)) //true : buffer를 자동으로 비워줌
            {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("클라이언트로 부터 받은 메세지: " + line);
                    pw.println(line); // 클라이언트로 송신
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        catch (IOException ex) {
            System.out.println("접속 실패");
        // Handle exceptions;
        }
    }
}
