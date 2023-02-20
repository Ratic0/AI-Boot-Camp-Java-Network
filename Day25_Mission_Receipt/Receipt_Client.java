package Day25_Mission_Receipt;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Receipt_Client {
    public static void main(String[] args) throws IOException {
        int c;
        Scanner sc = new Scanner(System.in);
        try {
            Socket socket = new Socket("165.246.116.79", 5000);
            System.out.println("메뉴: 1. Create | 2. Update | 3. Delete | 4. Exit");
            System.out.print("선택: ");
            // 소켓 데이터 스트림에 넣고
            OutputStream out = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            c = sc.nextInt();
            sc.nextLine();

            if (c == 1) {
                BufferedReader stdin1 = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader stdin2 = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader stdin3 = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("상품 생성");
                System.out.print("상품 이름: ");
                String itemInfo1 = stdin1.readLine();
                writer.println(itemInfo1);
                System.out.print("상품 가격: ");
                String itemInfo2 = stdin2.readLine();
                writer.println(itemInfo2);
                System.out.print("상품 재고: ");
                String itemInfo3 = stdin3.readLine();
                writer.println(itemInfo3);
            }
            // close the socket
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}