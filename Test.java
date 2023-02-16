import java.nio.Buffer;
import java.nio.ByteBuffer;
public class Test {
    public static void main(String[] args) {
        System.out.println("[7바이트 크기로 버퍼 생성]");
        ByteBuffer buffer = ByteBuffer.allocateDirect(7);
        printState(buffer);

        buffer.put((byte)10); // 버퍼를 1바이트단위로 다루기로 했다. -128~+127 가능한 바이트로 가능
        buffer.put((byte)11);
        System.out.println("[2바이트 저장 후]");
        printState(buffer);

        buffer.put((byte)12);
        buffer.put((byte)13);
        buffer.put((byte)14);
        System.out.println("[3바이트 저장 후]");
        printState(buffer);

        buffer.flip();
        System.out.println("[flip() 실행 후]");
        printState(buffer);

        buffer.get(new byte[3]);
        System.out.println("[3바이트 읽은 후]");
        printState(buffer); //3 5 7

        buffer.mark();
        System.out.println("--------[현재 위치를 마크해놓음]");//  3 5 7(mark = 3)

        buffer.get(new byte[2]);
        System.out.println("[2바이트 읽은 후]"); // 5 5 7 (mark = 3)
        printState(buffer);

        buffer.reset();
        System.out.println("--------[position을 마크 위치로 옮김]"); // 3 5 7
        printState(buffer);

        buffer.rewind(); // position 을 0으로 limit는 그대로 0 5 7
        System.out.println("[rewind() 실행 후]");
        printState(buffer);

        buffer.clear(); // 0 7 7
        System.out.println("[clear() 실행 후]");
        printState(buffer);
    }

    public static void printState(Buffer buffer) {
        System.out.print("\tposition:" + buffer.position() + ", ");
        System.out.print("\tlimit:" + buffer.limit() + ", ");
        System.out.println("\tcapacity:" + buffer.capacity());
    }
}



