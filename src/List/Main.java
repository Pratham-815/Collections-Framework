package List;

import java.util.*;

/**
 * Notes: ArrayList in Java & Its Methods
 *
 * ArrayList is a resizable array implementation of the List interface.
 * It allows duplicate elements, maintains insertion order, and provides random access.
 *
 * Commonly used methods:
 * - add(E e): Adds element to the end.
 * - add(int index, E element): Inserts element at specified index.
 * - remove(Object o): Removes first occurrence of specified element.
 * - remove(int index): Removes element at specified index.
 * - get(int index): Returns element at specified index.
 * - set(int index, E element): Replaces element at specified index.
 * - contains(Object o): Checks if element exists.
 * - size(): Returns number of elements.
 * - clear(): Removes all elements.
 * - addAll(Collection c): Adds all elements from another collection.
 * - asList(T... a): Returns a fixed-size list backed by the specified array.
 *
 * Examples:
 */
public class Main {
    public static void main(String[] args) {

        // Creating an ArrayList with initial capacity 11
        List<Integer> list = new ArrayList<>(11);

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Removing an element by value
        list.remove(Integer.valueOf(10));   // removes 10

        // Iterating using index
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // Iterating using enhanced for-loop
        for(int x: list){
            System.out.println(x);
        }

        // Checking if list contains an element
        System.out.println(list.contains(20)); // true
        System.out.println(list.contains(25)); // false

        // Adding element at a specific index
        list.add(1, 25);           // add 25 at index 1

        // Replacing element at a specific index
        list.set(2, 35);        // replace element at index 2 with 35

        // Arrays.asList() usage
        List<String> list1= Arrays.asList("Monday", "Tuesday", "Wednesday");
        System.out.println(list1.getClass().getName());        // java.util.Arrays$ArrayList

        // Creating a list from an array (fixed-size)
        String[] str = {"Apple", "Banana", "Mango"};
        List<String> list2 = Arrays.asList(str);   // Cannot add/remove elements

        // Creating a modifiable ArrayList from another list
        List<String> list3 = new ArrayList<>(list2);
        list3.add("Cherry");
        list3.addAll(list1);
        System.out.println(list3);

        // Note: ArrayList is not synchronized. Use Collections.synchronizedList() for thread safety.
    }
}
