package com.patrick;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    ArrayList myArray = new ArrayList(); //Create ArrayList.
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
        }
    }
}
