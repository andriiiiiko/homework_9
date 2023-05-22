package myarraylist;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add("Element 1");
        myArrayList.add("Element 2");
        myArrayList.add("Element 3");

        System.out.println("Size of the list: " + myArrayList.size());

        System.out.println("Elements of the list:");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        myArrayList.remove(1);

        System.out.println("Elements of the list after removal:");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        myArrayList.clear();

        System.out.println("Size of the list after clearing: " + myArrayList.size());
    }
}