package mylinkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("Element 1");
        myLinkedList.add("Element 2");
        myLinkedList.add("Element 3");

        System.out.println("Size of the list: " + myLinkedList.size());

        System.out.println("Elements of the list:");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        myLinkedList.remove(1);

        System.out.println("Elements of the list after removal:");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        myLinkedList.clear();

        System.out.println("Size of the list after clearing: " + myLinkedList.size());
    }
}