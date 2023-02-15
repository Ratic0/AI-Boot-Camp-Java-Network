package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("서울", "부산", "광주", "대구", "부산","서울","대전","서울","경기");
        Stream<String> st = cities.stream();
        st.filter(city -> city.startsWith("대")).forEach(c -> System.out.print(c + " "));
        //        st.forEach(c -> System.out.print(c + " "));
    }
}
