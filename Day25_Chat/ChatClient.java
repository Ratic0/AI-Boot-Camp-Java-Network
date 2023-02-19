package Day25_Chat;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class ChatClient {
    public ChatClient() {
        SocketAddress address = new InetSocketAddress("165.246.116.122", 5001);
        try (SocketChannel socketChannel = SocketChannel.open(address)) {
            System.out.println("Connected to Chat Server");
            String message;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                // Receive message
                System.out.println("Waiting for message from the server ...");
                System.out.println("Message: " + HelperMethods.receiveMessage(socketChannel));
//                System.out.println("Message: " + HelperMethods.receiveFixedLengthMessage(socketChannel));
                System.out.print("> ");
                message = scanner.nextLine();
                if (message.equalsIgnoreCase("quit")) {
                    HelperMethods.sendMessage(socketChannel, "Client terminating");
//                HelperMethods.sendFixedLengthMessage(socketChannel, "Client terminating");
                    break;
                }

//                 Send message
                HelperMethods.sendMessage(socketChannel, message);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        public static void main(String[] args) {
        new ChatClient();
    }
}