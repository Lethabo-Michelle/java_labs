package org.example;

import java.util.Scanner;

public class GradeCalculator {

    public void passOrFail(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        if(marks < 0 || marks > 100){
            System.out.println("Invalid marks");
        }
         if(marks < 50){
             System.out.println("Fail");
         }
         else if(marks >= 50 && marks < 70) {
             System.out.println("Pass");
         }
         else if (marks >= 70 && marks < 80) {
             System.out.println("Merit");
         }
         else {
             System.out.println("Distinction");
         }
    }
}