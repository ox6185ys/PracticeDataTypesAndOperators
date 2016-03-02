package com.patrick;
import java.util.*;
public class Main {
    public static void main(String[] args) {
/*    ArrayList myArray = new ArrayList(); //Create ArrayList.
        myArray.add("Java Programming"); //Add element to ArrayList.
        myArray.add("SQL Server");
        myArray.add("Linux");

        //Neatly gather ArrayList elements and print.
        for (Object item : myArray) {
            System.out.println(item);
        }
        System.out.println();
        //This removes java from the ArrayList.
        myArray.remove("Java Programming");

        //Neatly gather ArrayList elements and print.
        for (Object item : myArray) {
            System.out.println(item);
        }
        System.out.println();
        //Add element to ArrayList.
        myArray.add("Micro Computer Management");
        myArray.add("Data Communications");
        //Neatly gather ArrayList elements and print.
        for (Object item : myArray) {
            System.out.println(item);
        }*/
/*        LinkedList stack = new LinkedList();

        stack.push(4);
        stack.push(10);
        stack.push(106);
        stack.push("google");
        stack.push("buzzfeed");
        stack.push("youtube");
        stack.push("apple");
        while (stack.peek()!= null){
            System.out.println(stack.pop());
        }
        System.out.println("Top element = " + stack.peek());*/

/*        LinkedList queue = new LinkedList();
        queue.add(123);
        queue.add(456);
        queue.add(789);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());*/

/*        String hello = "hello";
        String helloExclamation = "hello!";
        String helloCapitalH = "Hello";

        System.out.println(hello.hashCode());
        System.out.println(helloExclamation.hashCode());
        System.out.println(helloCapitalH.hashCode());*/
        HashMap h = new HashMap();
        h.put("1100", "Info Tech Concepts");
        h.put("1110", "Info Tech Skills");
        h.put("1150", "Programming Logic");
        h.put("1250", "Windows");
        h.put("1425", "Data Communications");

        System.out.println("Does hasmap contain the key 1100? " + h.containsKey("1100"));
        System.out.println("Does value for the 1150 key is? " + h.get("1150"));
        System.out.println("Is this hashmap empty? " + h.isEmpty());
        System.out.println("How many key value pairs? " + h.size());
        System.out.println("Is there an entry with the " +
                "value \"Windows\"? " + h.containsValue("Windows"));
        System.out.println("Delete the 1250 key value pair, return" +
                "the value. Value = " + h.remove("1250"));
        System.out.println("Delete a key that doesn't " +
                "exist, what does this return? " + h.remove("1724"));
        System.out.println("\nPrinting out all the key-value pairs using a for each loop.");
        System.out.println("Get a set of the keys and iterate over that set:\n");

        Set keySet = h.keySet();
        for (Object classNumber : keySet){
            System.out.println("Class number = " + classNumber + "Class " +
                    "Name = " + h.get(classNumber));
        }
        System.out.println("\nDisplaying all data, using an Iterator:\n");
        Iterator it = keySet.iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            System.out.println("Class Number = " + key + " Class Name = " + h.get(key));
        }
        System.out.println("\nPrinting out all values using an iterator. ");
        Collection values = h.values();
        for (Object value : values){
            System.out.println(value);
        }
        System.out.println("\nWhy can't I get the key from the value? ");
    }
}