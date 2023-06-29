import java.util.LinkedList;

public class Queue {
    private LinkedList<Object> queue;
    
    public Queue() {
        queue = new LinkedList<>();
    }
    
    public void enqueue(Object element) {
        queue.addLast(element);
    }
    
    public Object dequeue() {
        return queue.removeFirst();
    }
    
    public Object first() {
        return queue.getFirst();
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    public int size() {
        return queue.size();
    }
}