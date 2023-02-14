package Collection;

import java.util.Arrays;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        String[] soldiers1 = {"박민석", "차병호", "김상훈", "최일구"};

        List<String> soldiers2 = Arrays.asList(soldiers1);
        soldiers2.set(1, "성윤모");
        //soldiers2.add("지호진"); // 배열을 리스트로 변경했으므로 크기를 변경할 수 없다.

        for(String s : soldiers2)
            System.out.println(s + " ");
        System.out.println();

        soldiers2.sort((s1, s2) -> s1.length() - s2.length());
        String[] soldiers3 = soldiers2.toArray(new String[0]);
        for(int i =0; i< soldiers3.length; i++)
            System.out.println(soldiers3[i] + " ");
        System.out.println();

        List<String> grades = List.of("이병","일병","상병","병장");
        grades.forEach(g -> System.out.println(g + " "));
    }
}
