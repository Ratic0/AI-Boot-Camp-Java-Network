import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
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
        ExecutorService eService = Executors.newFixedThreadPool(2); // Thread 2 개로 제한 private 생성자로 객체생성이 제한되니 그 내부 static method를 통해 객체 생성
        System.out.println("다중 접속 에코 서버");

        try (ServerSocket serverSocket = new ServerSocket(22022)) {
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
        System.out.println("[" + Thread.currentThread() + "] 쓰레드 접속: ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            String inputLine;

            while ((inputLine = br.readLine()) != null) {
                System.out.println(clientSocket.getRemoteSocketAddress().toString() + "[" + Thread.currentThread() + "] 클라이언트가 보낸 메시지: " + inputLine);
                StringTokenizer ST = new StringTokenizer(inputLine,"+-*/",true);
                int result = 0, operand =0;
                char operator ='+';
                while(ST.hasMoreTokens()){
                    String token = ST.nextToken().trim();
                    if("+-*/".indexOf(token) >= 0){
                        operator = token.charAt(0);
                    }else{
                        operand = Integer.parseInt(token);
                        switch(operator){
                            case '+':
                                result += operand;
                                break;
                            case '-':
                                result -= operand;
                                break;
                            case '*':
                                result *= operand;
                                break;
                            case '/':
                                result /= operand;
                                break;
                        }
                    }
                }
                pw.println(inputLine + "="+ result);
            }
            System.out.println("[" + Thread.currentThread() + " 클라이언트가 종료됨");
        } catch (IOException ex) {
// Handle exceptions
        }
    }
}
