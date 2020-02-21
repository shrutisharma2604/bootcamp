package com.CollectionExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee>  list=new ArrayList<>();
        Employee emp=new Employee("Richa",2000,20);
        Employee emp1=new Employee("Shruti",1000,21);
        Employee emp2=new Employee("Neha",5000,25);
        Employee emp3=new Employee("Manoj",10000,27);
        list.add(emp);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        Collections.sort(list,new sorting());
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
