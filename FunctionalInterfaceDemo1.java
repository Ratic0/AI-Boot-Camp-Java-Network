import java.util.function.*;

// 함수적 인터페이스 (jdk 8 이상)
// Type          parameter   return value   method
// Predicate     O           boolean        test()
// Supplier      X           O              get()
// Consumer      O           void           accept()
// Function      O           O              apply()
// Operator      O           O              apply()
public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = n -> n + 8;
        System.out.println(f1.apply(7));

        ToDoubleBiFunction<String, Integer> f2 = (pi, radius) -> Double.parseDouble(pi) * radius;
        double area = f2.applyAsDouble("3.141592", 10);
        System.out.println(area);
//        BiConsumer<Integer, Integer> c2 = (n1,n2) -> System.out.println(n1+n2);
//        c2.accept(7,8);
//        Consumer<String> c1 = n -> System.out.println(n.toUpperCase());
//        c1.accept("Hello Java");

//        Supplier<Double> s1 = ()->2.71;
//        System.out.println(s1.get());
//
//        IntSupplier s2 = () -> (int)(Math.random()*6)+1;
//        System.out.println(s2.getAsInt());
//        Predicate<String> p = Predicate.isEqual("Test");
//        System.out.println(p.test("test"));
//        System.out.println(p.test("Java"));
//
//        IntPredicate odd = x -> x % 2 == 1;
//        System.out.println(odd.test(13) ? "홀수" : "짝수");
    }
}
