package com.CollectionExercise;
import java.util.*;
import java.lang.*;
public class Question4 {

    // function to sort hashmap by values
    public static HashMap<Integer,String> sortByValue(HashMap<Integer,String> map)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer,String> > list =
                new LinkedList<Map.Entry<Integer,String> >(map.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer,String> >() {
            public int compare(Map.Entry<Integer,String> o1,
                               Map.Entry<Integer,String> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer,String> temp = new LinkedHashMap<Integer,String>();
        for (Map.Entry<Integer,String> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    // Driver Code
    public static void main(String[] args)
    {

        HashMap<Integer,String> map = new HashMap<Integer,String>();

        // enter data into hashmap

        map.put(1,"Shruti");
        map.put(2,"Richa");
        map.put(3,"Rekha");
        Map<Integer,String> hm1 = sortByValue(map);

        // print the sorted hashmap
        for (Map.Entry<Integer,String> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
    }
}
