package myhashmap;

public class Main {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put("key1", "value1");
        myHashMap.put("key2", "value2");
        myHashMap.put("key3", "value3");
        myHashMap.put("key4", "value4");
        myHashMap.put("key5", "value5");

        System.out.println("Value for key1: " + myHashMap.get("key1"));
        System.out.println("Value for key3: " + myHashMap.get("key3"));
        System.out.println("Value for key5: " + myHashMap.get("key5"));

        System.out.println("Size of the map: " + myHashMap.size());

        myHashMap.remove("key2");

        System.out.println("Value for key2: " + myHashMap.get("key2"));

        System.out.println("Updated size of the map: " + myHashMap.size());

        myHashMap.clear();

        System.out.println("Size of the map after clearing: " + myHashMap.size());
    }
}