package org.example.lab3;

public class ArraysPractice {

    public void studentMarks(double[] marks){
        double total = 0;

        for (double mark : marks) {
            total += mark;
            System.out.println(mark);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + total/ marks.length);

    }


    public void arrayStatistics(int[] nums){
        int largest = nums[0];
        int smallest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < smallest){
                smallest = nums[i];
            }
            else {
                largest = nums[i];
            }
        }

        System.out.println("largest = " + largest);
        System.out.println("smallest = " + smallest);
        System.out.println("Number of elements = " + nums.length);
    }

    public void arraySearch(int[] nums, int num){
        String result = "Value found at index, ";
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == num){
                result += i + ", ";
                count =+ 1;
            }
        }

        if(count == 0){
            System.out.println("Value not found");
        }
        else {
            System.out.println(result);
        }
    }

    public void evenOddCount(int[] nums){
        int evenCount = 0;
        int oddCount = 0;

        for (int num : nums) {
            if (num % 2 == 0 || num == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }

        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Even numbers: " + evenCount);
    }
}
