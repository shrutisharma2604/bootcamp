package com.CollectionExercise;

import java.util.Comparator;

public class sorting1 implements Comparator <Student>{
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getScore()!=s2.getScore()) {
            return Double.compare(s1.getScore(), s2.getScore());
        }
        else{
            return s1.getName().compareTo(s2.getName());
        }
    }
}
