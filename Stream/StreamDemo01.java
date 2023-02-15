package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("서울", "부산", "광주", "대구", "부산","서울","대전","서울","경기");
        //old style
        Iterator<String> it = cities.iterator();
        while(it.hasNext()){
            String city = it.next();
            System.out.print(city + " ");
        }
        System.out.println();
        //modern style;
        //Stream<String> st = cities.stream();
        Stream<String> st = cities.parallelStream();
        st.forEach(c -> System.out.print(c + " "));
    }
}
