package CollectionFramework;

import java.util.Queue;
import java.util.LinkedList;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(22);
        queue.offer(67);
        queue.offer(34);
        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
