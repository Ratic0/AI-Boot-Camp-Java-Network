package second;

public class GenericMethodTest2 {
    static class Prints {
        public static <T extends Number> void printArray(T[] arr) {
            for (T a : arr)
                System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Double[] d1 = {3.14, 2.71, 9.9};
        String[] s1 = {"Hi", "Hello"};
        Character[] c1 = {'A', 'C', 'E'};
        Integer[] i1 = {10, 9, 7};
//        Prints.printArray(s1);
        Prints.<Double>printArray(d1);
//        Prints.printArray(c1);
        Prints.printArray(i1);
    }
}