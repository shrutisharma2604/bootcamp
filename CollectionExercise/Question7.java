package com.CollectionExercise;
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements:");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        List<Integer> number=new ArrayList<>();
        for (int i=0;i<size;i++){
            number.add(sc.nextInt());
        }

        Map<Integer,Integer> map=new HashMap<>();
        for(int i =0; i<size;i++){
            if (map.containsKey(number.get(i))) {
                map.put(number.get(i),map.get(number.get(i))+1);
            }
            else{
                map.put(number.get(i),1);
            }

        }
        List<Map.Entry<Integer,Integer>> list=new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return  o2.getValue().compareTo(o1.getValue());
            }

        });
        for (Map.Entry<Integer,Integer> entry:list
        ) {
            System.out.println("Element "+entry.getKey()+"frequency "+entry.getValue());
        }


    }
}
