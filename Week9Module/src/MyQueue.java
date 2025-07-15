import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class MyQueue<T extends Comparable<T>> {
    private LinkedList<T> queue = new LinkedList<>();
    private LinkedList<T> minQueue = new LinkedList<>();


    public void enqueue(T element) {
        queue.addLast(element);
        while (!minQueue.isEmpty() && minQueue.getLast().compareTo(element) > 0) {
            minQueue.removeLast();
        }
        minQueue.addLast(element);
    }

    public T dequeue() {
        if (queue.isEmpty()) return null;

        T removed = queue.pollFirst();
        if (removed.equals(minQueue.getFirst())) {
            minQueue.removeFirst();
        }
        return removed;
    }

    public T peek() {
        return queue.peekFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Queue: " + queue);
    }

    public void displaySorted() {
        List<T> sortedQueue = new ArrayList<>(queue);
        Collections.sort(sortedQueue);
        System.out.println("Sorted Queue: " + sortedQueue);
    }

    public T getMin() {
        if (minQueue.isEmpty()) return null;
        return minQueue.getFirst();
    }
}
