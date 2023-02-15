package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("서울", "부산", "광주", "대구", "부산","서울","대전","서울","경기");
        //old style
        Iterator<String> it = cities.iterator();  // 외부 반복자
        while(it.hasNext()){
            String city = it.next();
            System.out.print(city + " ");
        }
        System.out.println();
        //modern style;
        //Stream<String> st = cities.stream();
        Stream<String> st = cities.parallelStream(); // 병렬 스트림
        st.forEach(c -> System.out.print(c + " "));
    }
}
