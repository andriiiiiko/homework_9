package mystack;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push("Element1");
        myStack.push("Element2");
        myStack.push("Element3");

        System.out.println("Peek: " + myStack.peek());

        System.out.println("Pop: " + myStack.pop());

        System.out.println("Size: " + myStack.size());

        myStack.remove(0);

        System.out.println("Size after removing element: " + myStack.size());

        myStack.clear();
        System.out.println("Size after clearing: " + myStack.size());
    }
}