import java.util.function.Consumer;
public class test17 {
    public static void main(String[] args) {
        Consumer<String> c = (t) -> System.out.println(t); // 람다식을 인터페이스 타입 변수에 할당
        c.accept("Hello World");
    }
}
