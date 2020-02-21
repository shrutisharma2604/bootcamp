package com.CollectionExercise;
import java.util.*;
public class Question8
{
    public static void main(String[] args)
    {
        MyStack s = new MyStack();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(5);

        System.out.println("Minimum Element is : "+s.getMin());

        System.out.println("Popped Element is : "+s.pop());

        s.isFull();

    }
}