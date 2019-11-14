package familiarity.review.code;

import java.util.*;
/*
This entire file goes through various portions of collections
 */
public class Collections {
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        
        //1.) Add data into the ArrayList. Lists accept data in order and allow duplicates
        list.add("Slot 1");
        list.add("Slot 2");
        list.add("Slot 3");
        list.add("Slot 4");
        list.add("Slot 1");
        
        //2.) Print the data in the Arraylist
        System.out.println("The ArrayList has the current values of:" + list);
        
        //3.) Loop through the list
        int counter = 0;
        while (counter < list.size())
        {
            System.out.println("Array item " + counter + ": " + list.get(counter));
            counter++;
        }
        
        //4.) Change the data in the Arraylist
        list.set(3, 4);
        Object slot = list.get(3);
        System.out.println("The Arraylist value in the 4th place is now: " + slot);
        System.out.println("After changing the list, it now has the values of:" + list);
        
        //5.) Clear the list
        list.clear();
        System.out.println("The ArrayList has been cleared. It is now empty:" + list);
        
        //6.) Sets don't accept duplicates and store data randomly
        //Use a set if you have a bunch of data to check for duplicates
        Set setexample = new HashSet();
        setexample.add("Test 2");
        setexample.add("Test 1");
        setexample.add("Test 2");
        setexample.add("Test 4");
        setexample.add("Test 1");
        setexample.add("Test 3");
        
        System.out.println("The current set values are:" + setexample);
        setexample.clear();
        System.out.println("Set cleared:" + setexample);
        
        //7.) Trees don't accept duplicates and sorted into ascending order
        //Use a tree if you have a large amount of data that you want sorted
        TreeSet tree = new TreeSet();
        tree.add(1);
        tree.add(5);
        tree.add(3);
        tree.add(2);
        tree.add(4);
        tree.add(4);
        System.out.println("The Tree set has the following values: " + tree);
    }
    
}
