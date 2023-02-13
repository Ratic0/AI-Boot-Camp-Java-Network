import java.net.InetAddress;
import java.net.UnknownHostException;

public class day21 {
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName("www.inha.ac.kr"); //예외 처리가 필요한데, 1) Try Catch 로 묶거나
            System.out.println(addr);
            System.out.println(addr.getCanonicalHostName());
            System.out.println(addr.getHostAddress());
            System.out.println(addr.getHostName());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
//            System.out.println("해당 URL은 존재하지 않습니다.");
        }

    }
}
