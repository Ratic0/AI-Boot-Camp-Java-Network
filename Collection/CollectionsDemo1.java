package Collection;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        Collection<Double> list = Arrays.asList(2.17, 3.14, 0.99);
        Iterator<Double> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next() + " ");
        System.out.println();

//        while(it.hasNext())
//            System.out.println(it.next() + " ");
//        System.out.println();
        for(Double d : list)
            System.out.println(d+ " ");
        System.out.println();
    }
}
