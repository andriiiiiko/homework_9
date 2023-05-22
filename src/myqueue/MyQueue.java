package myqueue;

public class MyQueue {
    private Object[] array;
    private int front;
    private int rear;
    private int size;

    public MyQueue() {
        array = new Object[10];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void add(Object value) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            int j = 0;

            for (int i = front; i <= rear; i++) {
                newArray[j] = array[i];
                j++;
            }

            array = newArray;
            front = 0;
            rear = size - 1;
        }

        rear = (rear + 1) % array.length;
        array[rear] = value;
        size++;
    }

    public void clear() {
        array = new Object[10];
        front = 0;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            return null;
        }

        return array[front];
    }

    public Object poll() {
        if (size == 0) {
            return null;
        }

        Object element = array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        size--;

        return element;
    }
}