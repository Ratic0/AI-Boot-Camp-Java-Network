package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsDemo4 {
    public static void main(String[] args) {
        long s, e;
        ArrayList<Integer> al = new ArrayList<>(); // 인덱스 값 변경이 많은때
        LinkedList<Integer> ll = new LinkedList<>(); // 삽입 삭제가 많을때


        s = System.nanoTime();
        for(int i=0; i< 100000; i++)
            al.add(0,i);
        e= System.nanoTime();
        System.out.println(e-s);

        s = System.nanoTime();
        for(int i=0; i< 100000; i++)
            ll.addFirst(i);
        e= System.nanoTime();
        System.out.print(e-s);
    }
}
