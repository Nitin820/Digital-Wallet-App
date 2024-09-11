package stack.com;


class ArrayStack<T> implements stack<T> {
 private T[] stack;
 private int top;
 private int capacity;

 @SuppressWarnings("unchecked")
 public ArrayStack(int size) {
     stack = (T[]) new Object[size];
     top = -1;
     capacity = size;
 }

 @Override
 public void push(T item) {
     if (top == capacity - 1) {
         throw new StackOverflowError("Stack is full");
     }
     stack[++top] = item;
 }

 @Override
 public T pop() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
     }
     return stack[top--];
 }

 @Override
 public T peek() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
     }
     return stack[top];
 }

 @Override
 public boolean isEmpty() {
     return top == -1;
 }
}
