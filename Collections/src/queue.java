import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue after enqueue operations: " + queue);


        int dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);


        System.out.println("Queue after dequeue operation: " + queue);


        int frontElement = queue.peek();
        System.out.println("Front element in the queue: " + frontElement);
    }
}
