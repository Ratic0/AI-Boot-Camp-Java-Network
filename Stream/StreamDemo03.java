package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo03 {
    public static void main(String[] args) {
        List<Fruit> fruitList = Arrays.asList(
                new Fruit("watermelon", 16000),
                new Fruit("watermelon", 19000),
                new Fruit("strawberry", 10000),
                new Fruit("kiwi", 13000),
                new Fruit("banana", 6000)
        );
        System.out.println(
                fruitList
                        .stream()
                        //.mapToInt(f->f.getPrice())
                        .mapToInt(Fruit::getPrice)
                        .average()
                        .getAsDouble()
        );
//        fruitList.stream().forEach(f -> {
//            String name = f.getName();
//            int price = f.getPrice();
//            System.out.println(name + " : " + price);
//        });
    }
}