package CollectionFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(5);
        System.out.println(list);

        list.add(1, 23);
        list.add(2, 34);
        System.out.println(list);

        List<Integer> newList = new ArrayList();
        newList.addAll(list);
        System.out.println(newList);

        newList.add(666);
        newList.add(77);
        System.out.println(newList);

        System.out.println(list.get(2));

        list.remove(2);
        System.out.println(list);

        list.remove(Integer.valueOf(5));
        System.out.println(list);

        list.set(0, 0);
        System.out.println(list);

        System.out.println(list.contains(300));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer lists : list) {
            System.out.println("Foreach " + lists);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Iteration" + it.next());
        }
    }
}
