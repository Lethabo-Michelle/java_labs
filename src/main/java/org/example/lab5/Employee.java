package org.example.lab5;

public class Employee {
    String employeeNum;
    String name;
    double monthlySalary;

    public Employee(String name, String employeeNum, double monthlySalary) {
        this.employeeNum = employeeNum;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    void displayEmployee() {
        System.out.println(name + " " + monthlySalary);

    }
}
