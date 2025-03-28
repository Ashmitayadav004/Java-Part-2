package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Gatherer.Integrator;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(21);
        list.add(12);
        list.add(22);
        list.add(3);
        list.add(4);
        list.add(11);
        list.add(13);
        list.add(8);
        System.out.println("Min" + Collections.min(list));
        System.out.println("Max" + Collections.max(list));
        System.out.println(Collections.frequency(list, 4));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
