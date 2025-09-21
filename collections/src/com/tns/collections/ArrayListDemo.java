package com.tns.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Integer ArrayList
        ArrayList<Integer> intList = new ArrayList<>();

        // Check if empty
        System.out.println("Is the ArrayList empty? " + intList.isEmpty());

        // Adding elements
        intList.add(22);
        intList.add(7);
        intList.add(2221);
        intList.add(22); // duplicate
        intList.add(null); // null allowed
        intList.add(99);

        System.out.println("Elements after adding: " + intList);

        // Add element at specific index
        intList.add(2, 55);
        System.out.println("After adding 55 at index 2: " + intList);

        // Get element at index
        System.out.println("Element at index 3: " + intList.get(3));

        // Set / update element
        intList.set(0, 100);
        System.out.println("After updating index 0 to 100: " + intList);

        // Remove by index
        intList.remove(1);
        System.out.println("After removing element at index 1: " + intList);

        // Remove by value
        intList.remove(Integer.valueOf(22));
        System.out.println("After removing value 22: " + intList);

        // Check contains
        System.out.println("Contains 2221? " + intList.contains(2221));

        // IndexOf and lastIndexOf
        System.out.println("Index of 22: " + intList.indexOf(22));
        System.out.println("Last index of 22: " + intList.lastIndexOf(22));

        // Size of ArrayList
        System.out.println("Size of ArrayList: " + intList.size());

        // Iterating using for loop
        System.out.println("Iterating using for loop:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("Index " + i + ": " + intList.get(i));
        }

        // Iterating using for-each
        System.out.println("Iterating using for-each loop:");
        for (Integer num : intList) {
            System.out.println(num);
        }

        // Iterating using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> it = intList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Clear the list
        intList.clear();
        System.out.println("After clear(), is empty? " + intList.isEmpty());

        // String ArrayList
        List<String> strList = new ArrayList<>();
        strList.add("bang");
        strList.add("mysore");
        strList.add("delhi");
        System.out.println("\nString ArrayList elements: " + strList);
    }
}
