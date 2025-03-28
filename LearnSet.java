package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // Set<Integer> set1 = new LinkedHashSet<>();
        // Set<Integer> set2 = new TreeSet();
        set.add(2);
        set.add(32);
        set.add(45);
        set.add(21);
        set.add(33);
        set.add(44);
        set.add(67);
        System.out.println(set);

        set.remove(32);
        System.out.println(set);

        System.out.println(set.contains(33));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);

    }
}
