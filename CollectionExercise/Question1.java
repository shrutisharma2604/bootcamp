package com.CollectionExercise;

import java.util.ArrayList;
import java.util.*;
public class Question1{
    public static void main(String[] args) {
        List<Float> list=new ArrayList<Float>();
        list.add(1.5f);
        list.add(2.5f);
        list.add(3.5f);
        list.add(4.5f);
        list.add(5.5f);
        float sum=0.0f;
        System.out.println("Sum of 5 floating point number is");
        Iterator<Float> itr;
        itr = list.iterator();
        while(itr.hasNext()){
            sum+=itr.next();
        }
        System.out.println(sum);
    }
}