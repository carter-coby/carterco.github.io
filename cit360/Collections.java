package familiarity.review.code;

import java.util.*;
/**
 *
 * @author cobyc
 */
public class Collections {
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        
        //1.) Add data into the ArrayList
        list.add("Slot 1");
        list.add("Slot 2");
        list.add("Slot 3");
        list.add("Slot 4");
        
        //2.) Print the data in the Arraylist
        System.out.println("The ArrayList has the current values of:" + list);
        
        //3.) Change the data in the Arraylist
        list.set(3, 4);
        Object slot = list.get(3);
        System.out.println("The Arraylist value in the 4th place is now: " + slot);
        System.out.println("After changing the list, it now has the values of:" + list);
        
        //4.) Clear the list
        list.clear();
        System.out.println("The ArrayList has been cleared. It is now empty:" + list);
        
        Set setexample = new HashSet();
        setexample.add("Test 1");
        setexample.add("Test 2");
        setexample.add("Test 3");
        setexample.add("Test 4");
        setexample.add("Test 1");
        
        System.out.println("The current set values are:" + setexample);
        setexample.clear();
        System.out.println("Set cleared:" + setexample);
        
        
        
    }
    
}
