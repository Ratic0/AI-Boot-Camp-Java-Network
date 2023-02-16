package Day24_Mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day24_Mission_Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("클라이언트 > 날싸 서버의 IP 주소는 ?");
        String myip = sc.nextLine();
        try (Socket client = new Socket(myip, 9000);
             BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

        ) {
            System.out.println(in.readLine());
        }
    }
}