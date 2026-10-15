package org.example.lab2;

public class NumberAnalysis {

    public void isEvenOrOdd(int num){
        if(num == 0){
            System.out.println("num is 0 and is even");
        }

        if(num < 0){
            System.out.println("negative");
        }
        else {
            System.out.println("positive");
        }

        if (num % 2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

}
