package com.CollectionExercise;

public class Student {
    private String Name;
    private double score;
    private double age;

    public Student(String Name,double score,double age) {
        this.Name=Name;
        this.score=score;
        this.age=age;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }
}
