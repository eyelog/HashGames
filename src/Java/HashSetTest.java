package Java;

import Models.StartA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {

        Set<StartA> set = new HashSet<>();
        System.out.println("Step 1");
        set.add(new StartA(1L, "name1"));
        System.out.println("Step 2");
        set.add(new StartA(1L, "name1"));
        System.out.println("Step 3");
        set.add(new StartA(1L, "name2"));
        System.out.println("Step 4");
        set.add(new StartA(1L, "name1"));
        System.out.println(set.size());
        System.out.println("HashSet: " + set);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(System.identityHashCode(iterator.next()));
//            System.out.println(iterator.next().hashCode());
        }
    }
}
