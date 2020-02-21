package com.CollectionExercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Main1 {
    public static void main(String[] args) {
        List<Student>  list=new ArrayList<>();
        Student s1=new Student("Richa",90,20);
        Student s2=new Student("Suraj",80,22);
        Student s3=new Student("Priya",90,21);
        Student s4=new Student("Nisha",100,23);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list,new sorting1());
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
