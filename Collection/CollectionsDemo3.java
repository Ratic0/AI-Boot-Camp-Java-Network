package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        s1.push(5);
        s1.push(1);
        s1.push(3);

        System.out.println(s1.pop());
        System.out.println(s1.peek());

        for(Integer i : s1)
            System.out.println(i);
    }
}
//        List<String> soldier = List.of("차병호", "성윤모", "강찬석");
//        System.out.println(soldier.contains("차병호"));
//        System.out.println(soldier.contains("최일구"));
//        System.out.println(soldier.indexOf("성윤모"));
//
//        List<String> s1 = new ArrayList<>(soldier);
//        s1.add("박민석");
//        s1.add("김상훈");
//        List<String> s2 = new ArrayList<>(soldier);
//        s2.remove("성윤모");
//        System.out.println(s1.containsAll(s2));
//        s1.removeIf((r) -> r.endsWith("석"));
//        s1.replaceAll(x -> "신병" + x);
//        s1.forEach(s -> System.out.print(s + " "));
//    }
//}
