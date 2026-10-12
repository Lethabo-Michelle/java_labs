package org.example;

public class StudentDetails {
    public String name = "Naledi";
    public int age = 20;
    public double avrMarks = 76.5;
    public boolean isRegistered = true;

    public void displayStudentDetails(){

        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Mark: " + avrMarks);
        System.out.println("Registered: " + isRegistered);
        System.out.println();
    }
}
