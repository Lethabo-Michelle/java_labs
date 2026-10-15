package org.example;

public class FullStack {
    String name;
    int age;
    String gender;
    boolean isEmployed;

    FullStack(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEmployed = false;
    }

    void displayDetails(){
        System.out.println(this.name + " " + this.age + " " + gender + " " + isEmployed);
    }
}
