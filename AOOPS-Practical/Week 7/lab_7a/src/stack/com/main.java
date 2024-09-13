package stack.com;

public class main {
    public static void main(String[] args) {
       
        stack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println("LinkedList Stack Peek (Integer): " + linkedListStack.peek());
        System.out.println("LinkedList Stack Pop (Integer): " + linkedListStack.pop());
        System.out.println("LinkedList Stack Is Empty? " + linkedListStack.isEmpty());

        
        stack<String> arrayStack = new ArrayStack<>(5);
        arrayStack.push("Apple");
        arrayStack.push("Banana");
        arrayStack.push("Cherry");
        System.out.println("Array Stack Peek (String): " + arrayStack.peek());
        System.out.println("Array Stack Pop (String): " + arrayStack.pop());
        System.out.println("Array Stack Is Empty? " + arrayStack.isEmpty());

        
        stack<Float> floatLinkedListStack = new LinkedListStack<>();
        floatLinkedListStack.push(5.5f);
        floatLinkedListStack.push(7.8f);
        floatLinkedListStack.push(2.4f);
        System.out.println("LinkedList Stack Peek (Float): " + floatLinkedListStack.peek());
        System.out.println("LinkedList Stack Pop (Float): " + floatLinkedListStack.pop());
        System.out.println("LinkedList Stack Is Empty? " + floatLinkedListStack.isEmpty());
    }
}
