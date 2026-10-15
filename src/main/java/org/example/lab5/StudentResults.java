package org.example.lab5;

import java.util.Arrays;

public class StudentResults {
    String name;
    String stdNumber;
    double[] marks;
    double average;
    boolean areValid;

    public StudentResults(String name, String stdNumber, double[] marks) {
        this.name = name;
        this.stdNumber = stdNumber;

        if (marksValidation(marks)){
            this.marks = marks;
        }
        else{
            System.out.println("Invalid marks");
        }
    }

    public boolean marksValidation(double[] marks){
        for(double mark: marks){
            if(mark < 0 || mark > 100){
                areValid = false;
                return false;
            }
        }
        areValid = true;
        return true;
    }

    public void displayDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Number: " + stdNumber);
        System.out.println(Arrays.toString(marks));
    }

    public void hasPassed(){
        double total = 0;

        if(areValid){
            for (double mark : marks) {
                total += mark;
            }
            average = total / marks.length;
            System.out.println("Average: " + average);

            if(average >= 50){
                System.out.println("Pass");;
            } else {
                System.out.println("Fail");
            }

        }
        else {
            System.out.println("Invalid marks!!!");
        }

    }
}
