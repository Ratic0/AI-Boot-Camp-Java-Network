package Day25_Mission_Receipt;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.net.ServerSocket;

public class Receipt_Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("[상품 목록]");
        System.out.println("---------------------------------------------------------------");
        System.out.println("no    name                            price           stock    ");
        System.out.println("---------------------------------------------------------------");
        startServer();
    }
}
