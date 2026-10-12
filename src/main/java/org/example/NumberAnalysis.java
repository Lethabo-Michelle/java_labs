package org.example;

import java.util.Scanner;

public class NumberAnalysis {

    public void isEvenOrOdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

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
