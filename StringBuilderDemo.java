//StringBuilder vs String
// string append
public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = new String("hi");
        long start = System.nanoTime();
        System.out.println(s.hashCode()); //hashCode() -> 객체의 메모리 번지를 이용해 해시코드를 만들어 리턴
        for (int i=1; i<100000; i++)
            s = s + "!";
        long end = System.nanoTime();
        System.out.println(end - start);

        StringBuilder sb = new StringBuilder("hi");
        start = System.nanoTime();
        for (int i=1; i<100000; i++)
            sb = sb.append("!");
        end = System.nanoTime();
        System.out.println(end - start);

    }
}

