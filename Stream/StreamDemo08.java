package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo08 {
    public static void main(String[] args) {


        List<Fruit> fruitList = Arrays.asList(
                new Fruit("watermelon", 16000),
                new Fruit("watermelon", 19000),
                new Fruit("strawberry", 10000),
                new Fruit("kiwi", 13000),
                new Fruit("banana", 6000)
        );
        Stream<Fruit> st = fruitList.stream();
        //st.sorted((f1, f2) -> f2.compareTo(f1)).forEach(f -> System.out.println(f.getName() + " "));
        st.sorted(Comparator.naturalOrder()).forEach(f -> System.out.println(f.getName() + " "));
    }

}
