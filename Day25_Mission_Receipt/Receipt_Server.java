package Day25_Mission_Receipt;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Receipt_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        int num = 1;
        while (true) {
            Socket clientSocket = serverSocket.accept();

            System.out.println("[상품 목록]");
            System.out.println("---------------------------------------------------------------");
            System.out.println("no    name                            price           stock    ");
            System.out.println("---------------------------------------------------------------");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            OutputStream out = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true);

            String itemInfo1 = in.readLine();
            System.out.print(num+"      ");
            num += 1;
            System.out.print(itemInfo1 + "              ");
            String itemInfo2 = in.readLine();
            System.out.print(itemInfo2 + "        ");
            String itemInfo3 = in.readLine();
            System.out.println(itemInfo3);

            // print the details of the receipt here
        }
    }
}