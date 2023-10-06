package guru.qa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    private final Queue<String> queue;

    public QueueDemo() {
        queue = new LinkedList<>();
    }

    public void enqueue(String element) {
        queue.add(element);
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}