package org.example.lab4;

public class Student {
    public String name;
    public String studentNumber;
    public double mark;

    public Student(String name, String studentNumber, double mark){
        this.name = name;
        this.studentNumber = studentNumber;
        this.mark = mark;
    }

    public void dispalyDetails(){
        System.out.println("name = " + name);
        System.out.println("studentNumber = " + studentNumber);
        System.out.println("mark = " + mark);
    }

    public boolean hasPassed(){
        if(mark >= 50){
            return true;
        }

        return false;
    }
}
