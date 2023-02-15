import java.util.List;
import java.util.stream.Stream;

public class Day23_Mission_Stream {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배정화", "임꺽정", "연흥부", "김선달", "황진이");
        Stream<String> st;
        st = names.stream();
        st.filter(f -> f.charAt(0) < '이').forEach(f -> System.out.print(f + " "));

        st = names.stream();
        st.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();

        st = names.stream();
        System.out.println(st.findFirst());
        st = names.stream();
        System.out.println(st.findFirst().get());

        st = names.stream();
        System.out.println(st.count());
    }
}
