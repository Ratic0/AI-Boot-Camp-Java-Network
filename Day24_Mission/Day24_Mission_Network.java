package Day24_Mission;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Day24_Mission_Network {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(9000);
             Socket connection = server.accept();
             PrintWriter pw = new PrintWriter(connection.getOutputStream(), true);)
        {
            System.out.println("서버 > " + new Date().toString() );
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
