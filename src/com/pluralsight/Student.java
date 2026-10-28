package com.pluralsight;




public class Student {
    private String name;
    private int age;
    private double grade;

    // constructor

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

    }
    // getter for age
    public int getAge() {
        return age;

    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;

    }

    // setter
    public void setGrade(double grade) {
        this.grade = grade;

    }

}
