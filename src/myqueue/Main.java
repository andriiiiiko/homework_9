package myqueue;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.add("Element1");
        myQueue.add("Element2");
        myQueue.add("Element3");

        System.out.println("Peek: " + myQueue.peek());

        System.out.println("Poll: " + myQueue.poll());

        System.out.println("Size: " + myQueue.size());

        myQueue.clear();
        System.out.println("Size after clearing: " + myQueue.size());
    }
}