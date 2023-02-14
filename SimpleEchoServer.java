import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SimpleEchoServer implements Runnable {
    private static Socket clientSocket;

    public SimpleEchoServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
    } // python에 선언시 self가 있다.

    // 다중 접속을 위한 병렬처리 에코 서버
    public static void main(String[] args) {
        ExecutorService eService = Executors.newFixedThreadPool(2); // Thread 2 개로 제한
        System.out.println("다중 접속 에코 서버");

        try (ServerSocket serverSocket = new ServerSocket(20010)) {
            while (true) {
                System.out.println("연결 대기중...");
                clientSocket = serverSocket.accept();
                SimpleEchoServer tes = new SimpleEchoServer(clientSocket);
                // new Thread(tes).start();
                eService.submit(tes);
            }
        } catch (IOException e) {
            System.out.println("입출력 예외 발행!");

        }
        System.out.println("다중 접속 에코 발생");
        eService.shutdown();
    }

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread() + "] 쓰레드 : ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                System.out.println("[" + Thread.currentThread() + "] 클라이언트가 보낸 메시지: " + inputLine);
                out.println(inputLine);
            }
            System.out.println("[" + Thread.currentThread() + " 클라이언트가 종료됨");
        } catch (IOException ex) {
// Handle exceptions
        }
    }
}
