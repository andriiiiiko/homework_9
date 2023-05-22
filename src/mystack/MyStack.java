package mystack;

public class MyStack {
    private Object[] array;
    private int top;
    private int size;

    public MyStack() {
        array = new Object[10];
        top = -1;
        size = 0;
    }

    public void push(Object value) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }

        top++;
        array[top] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException();
        }

        int numElementsToMove = top - index;
        if (numElementsToMove > 0) {
            System.arraycopy(array, index + 1, array, index, numElementsToMove);
        }

        array[top] = null;
        top--;
        size--;
    }

    public void clear() {
        array = new Object[10];
        top = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            return null;
        }

        return array[top];
    }

    public Object pop() {
        if (size == 0) {
            return null;
        }

        Object element = array[top];
        array[top] = null;
        top--;
        size--;

        return element;
    }
}