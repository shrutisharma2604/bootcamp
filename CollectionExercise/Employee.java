package com.CollectionExercise;

public class Employee {
    private String Name;
    private double salary;
    private double age;

    public Employee(String Name,double salary,double age) {
        this.Name=Name;
        this.salary=salary;
        this.age=age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

}