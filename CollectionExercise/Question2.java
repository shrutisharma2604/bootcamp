package com.CollectionExercise;

import java.util.*;
public class Question2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        checkUniqueNumber(str);
    }

    public static void checkUniqueNumber(String str) {
        Set<Character> set1=new HashSet<Character>();
        String uniquechar="";
        for (int i = 0; i < str.length(); i++) {
            set1.add(str.charAt(i));
        }
        for(Character value: set1){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(value.equals(str.charAt(j))){
                    count++;
                }
            }
            if(count==1){
                uniquechar+=value;
            }
        }
        System.out.println(uniquechar);
    }
}