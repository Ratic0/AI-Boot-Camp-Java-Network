package Stream;

import java.util.stream.IntStream;
// 숫자 범위로부터 스트림 객체 생성
public class StreamDemo04 {
    private static int result;
    public static void main(String[] args){
        IntStream st = IntStream.rangeClosed(1, 10);
        //st.forEach(number -> System.out.println(number));
        st.forEach(System.out::println);
        st.forEach(n -> result += n);
        System.out.println(result);
    }
}