package Third;

import java.util.Arrays;
import java.util.Comparator;

public class StringDemoTest {
    public static void main(String[] args) {
        String[] strings = {"Hi", "Hello", "Hello friend professor"};
        //사전순
        //Array.sort(strings);
//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Arrays.sort(strings, (o1, o2) -> o1.length() - o2.length());

        for(String s : strings)
            System.out.println(s);
    }
}
