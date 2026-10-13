package org.example;

public class ArraysPractice {

    public void StudentMarks(double[] marks){
        double total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
            System.out.println(marks[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + total/ marks.length);

    }

    public void ArrayStatistics(int[] nums){
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
}
