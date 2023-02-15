import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Enumeration;

public class NetworkInterfaceTest {
    public static String getMACIdentifier(NetworkInterface network) {
        StringBuilder id = new StringBuilder();
        try {
            byte[] macBuffer = network.getHardwareAddress();
            if (macBuffer != null) {
                for (int i = 0; i < macBuffer.length; i++) {
                    id.append(String.format("%02X%s",macBuffer[i], (i < macBuffer.length - 1) ? "-" : "")); // [i], 이후 조건식 true -추가
                }
            } else {
                return "---";
            }
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
        return id.toString(); //스트링 빌더 객체를 문자열로 변환후 리턴
    }


    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
            System.out.println("IP address: " + address.getHostAddress());
            NetworkInterface network = NetworkInterface.getByInetAddress(address);
            System.out.println("MAC address: " + getMACIdentifier(network));
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }

    }
}

