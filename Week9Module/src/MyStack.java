import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class MyStack<T extends Comparable<T>> {
    private LinkedList<T> stack = new LinkedList<>();
    private LinkedList<T> minStack = new LinkedList<>();

    public void push(T element) {
        stack.push(element);
        if (minStack.isEmpty() || element.compareTo(minStack.peek()) <= 0) {
            minStack.push(element);
        }
    }

    public T pop() {
        if (stack.isEmpty()) return null;

        T popped = stack.pop();
        if (popped.equals(minStack.peek())) {
            minStack.pop();
        }
        return popped;
    }

    public T peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack: " + stack);
    }

    public void displaySorted() {
        ArrayList<T> sortedList = new ArrayList<>(stack);
        Collections.sort(sortedList);
        System.out.println("Sorted Stack: " + sortedList);
    }

    public T getMin() {
        if (minStack.isEmpty()) return null;
        return minStack.peek();
    }
}