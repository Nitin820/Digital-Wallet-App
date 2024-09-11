package queue.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class PriorityQueue<T> {
    private ArrayList<T> queue;
    private Comparator<? super T> comparator;

    
    public PriorityQueue(Comparator<? super T> comparator) {
        this.queue = new ArrayList<>();
        this.comparator = comparator;
    }

    
    public void enqueue(T item) {
        queue.add(item);
        queue.sort(comparator);  
    }

    
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty.");
        }
        return queue.remove(0);  
    }

    
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty.");
        }
        return queue.get(0);
    }

    
    public boolean isEmpty() {
        return queue.isEmpty();
    }

   
    public int size() {
        return queue.size();
    }
}
