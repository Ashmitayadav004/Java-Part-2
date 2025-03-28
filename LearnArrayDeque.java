package CollectionFramework;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offer(12);
        adq.offerFirst(9);
        adq.offerLast(2);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq);

        System.out.println(adq.pollFirst());
        System.out.println(adq);
        
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }
}
