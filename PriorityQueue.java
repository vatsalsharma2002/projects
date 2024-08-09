import java.util.LinkedList;
import java.util.List;

class PriorityQueue<T> {
    private List<Element<T>> queue;

    public PriorityQueue() {
        this.queue = new LinkedList<>();
    }

    public void offer(T item, int priority) {
        if (priority < 0 || priority > 9) {
            throw new IllegalArgumentException("Priority must be between 0 and 9");
        }
        offerRecursive(item, priority, 0);
    }

    private void offerRecursive(T item, int priority, int index) {
        if (index >= queue.size()) {
            queue.add(new Element<>(item, priority));
        } else if (queue.get(index).priority < priority) {
            queue.add(index, new Element<>(item, priority));
        } else {
            offerRecursive(item, priority, index + 1);
        }
    }

    public T take() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Take from an empty priority queue");
        }
        return takeRecursive();
    }

    private T takeRecursive() {
        if (queue.size() == 1) {
            return queue.remove(0).item;
        } else {
            return queue.remove(0).item;
        }
    }

    private static class Element<T> {
        T item;
        int priority;

        Element(T item, int priority) {
            this.item = item;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.offer("task1", 2);
        pq.offer("task2", 5);
        pq.offer("task3", 1);
        pq.offer("task4", 5);

        System.out.println(pq.take()); // task2
        System.out.println(pq.take()); // task4
        System.out.println(pq.take()); // task1
        System.out.println(pq.take()); // task3
    }
}