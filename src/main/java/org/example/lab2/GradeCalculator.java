package org.example.lab2;

public class GradeCalculator {

    static void main() {
        passOrFail(87);
    }

    public static void passOrFail(int marks){
        if(marks < 0 || marks > 100){
            System.out.println("Invalid marks");
        }
         if(marks < 50){
             System.out.println("Fail");
         }
         else if(marks < 70) {
             System.out.println("Pass");
         }
         else if (marks < 80) {
             System.out.println("Merit");
         }
         else {
             System.out.println("Distinction");
         }
    }
}