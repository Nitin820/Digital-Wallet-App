package queue.com;

import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.reverseOrder());
        intQueue.enqueue(10);
        intQueue.enqueue(5);
        intQueue.enqueue(20);
        System.out.println("Integer Priority Queue Peek: " + intQueue.peek());
        System.out.println("Integer Priority Queue Dequeue: " + intQueue.dequeue());
        System.out.println("Integer Priority Queue Dequeue: " + intQueue.dequeue());
        System.out.println("Integer Priority Queue Is Empty? " + intQueue.isEmpty());

        
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.reverseOrder());
        doubleQueue.enqueue(3.5);
        doubleQueue.enqueue(7.8);
        doubleQueue.enqueue(1.2);
        System.out.println("Double Priority Queue Peek: " + doubleQueue.peek());
        System.out.println("Double Priority Queue Dequeue: " + doubleQueue.dequeue());
        System.out.println("Double Priority Queue Dequeue: " + doubleQueue.dequeue());

        
        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Mango");
        System.out.println("String Priority Queue Peek: " + stringQueue.peek());
        System.out.println("String Priority Queue Dequeue: " + stringQueue.dequeue());
        System.out.println("String Priority Queue Dequeue: " + stringQueue.dequeue());
    }
}
