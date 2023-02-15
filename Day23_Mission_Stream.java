import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day23_Mission_Stream {
    public static void main(String[] args) {
        enum Gender {남, 여};
        Stream<String> st;
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25,20,29,28,32,18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);
        Stream<Integer> sti = ages.stream();
        System.out.println(sti.reduce(Integer::sum).get());
        sti = ages.stream();
        System.out.println(sti.max(Integer::compareTo).get());
        IntStream ss = ages.stream().mapToInt(a -> a.intValue()); // ????
        System.out.println(ss.average().getAsDouble());


    }
}
