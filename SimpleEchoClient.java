import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SimpleEchoClient {
    public static void main(String[] args) {
        System.out.println("에코 클라이언트 시작됨");
        try {
            InetAddress localAddress = InetAddress.getLocalHost(); // ipv4 : 165.246.116.122
            Socket clientSocket = null;
            PrintWriter pw = null;
            BufferedReader br = null;
            try {
                clientSocket = new Socket("165.246.115.165", 20000); //상대방과 송수신시 localAddress를 상대방의 Ip주소로 변경해야됨
                pw = new PrintWriter(clientSocket.getOutputStream(), true); // 보내는 버퍼
                br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // 수신하는 버퍼
                System.out.println("서버에 연결됨");
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.print("전송 메시지 입력 : ");
                    String line = sc.nextLine();
                    if ("exit".equalsIgnoreCase(line)) {
                        break; // 종료 조건
                    }
                    pw.println(line); // 서버로 전송
                    //String response = br.readLine(); // 서버로 부터 수신받은 객체에서 라인 단위로 문자열 반환
                    System.out.println("서버로 부터 받은 메아리 : " + br.readLine());
                }

            }catch (IOException ex) {
                System.out.println("입출력 예외 발생");
            }finally { // 자원해제
                clientSocket.close();
                pw.close();
                br.close();
            }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
