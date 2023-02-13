package second;

public class GenericMethodTest1 {
    static class Prints {
        public static <T> void printArray(T[] arr) {
            for (T a : arr)
                System.out.println(a);

        }
        public static <T> T getFirst(T[] arr){
        return arr[0];
        }
        public static void main(String[] args) {
            Double[] d1 = {3.14, 2.71, 9.9};
            String[] s1 = {"Hi", "Hello"};
            Character[] c1 = {'A', 'C', 'E'};
            Integer[] i1 = {10, 9, 7};

            System.out.println(Prints.getFirst(c1));
//            Prints.printArray(s1);
            Prints.<Double>printArray(d1);
//            Prints.printArray(c1);
            Prints.printArray(i1);
        }
    }
}