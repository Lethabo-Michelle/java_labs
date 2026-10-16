package org.example.lab6;

public class Debugging {

    static void main() {
        stringComparison();
        arrayIndex();
        gradeCondition();
    }


//    ### Exercise 6.1: Incorrect String comparison
//
//    Explain why the following code may print `Different text`, then correct
//    it to compare String contents.
//
//``` java
//    String first = new String("Java");
//    String second = new String("Java");
//
//if (first == second) {
//        System.out.println("Same text");
//    } else {
//        System.out.println("Different text");
//    }
//```
    public static void stringComparison(){
        String first = new String("Java");
        String second = new String("Java");

        if (first.equals(second)) {
            System.out.println("Same text");
        } else {
            System.out.println("Different text");
        }
    }
//== checks if both variables points to the same object in memory
//.equals check if the strings contains same characters
//
//    Explain the error and correct the loop condition.
//
//            ``` java
//    int[] numbers = {10, 20, 30};
//
//for (int i = 0; i <= numbers.length; i++) {
//        System.out.println(numbers[i]);
//    }
//```
    public static void arrayIndex(){
        int[] numbers = {10, 20, 30};

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.println(numbers[i]);
        }
    }
//    index out of bound


//    Rewrite the conditions so a mark of 85 displays `Distinction`.
    public static void gradeCondition(){
        int mark = 85;

        if (mark >= 80) {
            System.out.println("Distinction");
        } else {
            System.out.println("Pass");
        }
    }

//    ### Exercise 6.4: Unsafe withdrawal
//Test your `BankAccount` class by withdrawing a valid amount, zero, a
//negative amount, more than the balance, and exactly the full balance.
//Confirm the balance remains correct after every operation.


}
