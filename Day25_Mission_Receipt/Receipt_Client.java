package Day25_Mission_Receipt;

import java.net.Socket;
import java.util.Scanner;

public class Receipt_Client {
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        try {
            Socket socket = new Socket("192.168.50.244", 5000);
            System.out.println("메뉴: 1. Create | 2. Update | 3. Delete | 4. Exit");
            System.out.print("선택: ");
            c = sc.nextInt();
            sc.nextLine();
        }
    }
}
