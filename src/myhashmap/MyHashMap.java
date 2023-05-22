package myhashmap;

public class MyHashMap {
    private static class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] array;
    private int capacity;
    private int size;

    public MyHashMap() {
        capacity = 16;
        array = new Node[capacity];
        size = 0;
    }

    public void put(Object key, Object value) {
        int index = getIndex(key);
        Node newNode = new Node(key, value);

        if (array[index] == null) {
            array[index] = newNode;
        } else {
            Node currentNode = array[index];

            while (currentNode.next != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    return;
                }

                currentNode = currentNode.next;
            }

            if (currentNode.key.equals(key)) {
                currentNode.value = value;
            } else {
                currentNode.next = newNode;
            }
        }

        size++;
    }

    public void remove(Object key) {
        int index = getIndex(key);

        if (array[index] == null) {
            return;
        }

        if (array[index].key.equals(key)) {
            array[index] = array[index].next;
            size--;
            return;
        }

        Node prevNode = array[index];
        Node currentNode = prevNode.next;

        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                prevNode.next = currentNode.next;
                size--;
                return;
            }

            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void clear() {
        array = new Node[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        int index = getIndex(key);

        Node currentNode = array[index];

        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }

            currentNode = currentNode.next;
        }

        return null;
    }

    private int getIndex(Object key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % capacity);
    }
}