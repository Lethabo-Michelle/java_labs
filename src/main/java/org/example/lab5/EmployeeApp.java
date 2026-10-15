package org.example.lab5;

import java.util.ArrayList;

public class EmployeeApp {
    static void main() {
        double threshold = 5000;
        double total = 0;
        double averageSAlary;

        Employee emp1 = new Employee("Lethabo", "123", 10000);
        Employee emp2 = new Employee("Mary", "312", 1000);
        Employee emp3 = new Employee("Sarah", "543", 3000);
        Employee emp4 = new Employee("Sam", "876", 7000);
        Employee emp5 = new Employee("Lee", "978", 9000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        for (Employee emp: employees){
            total += emp.monthlySalary;
            if(emp.monthlySalary > threshold){
                System.out.println(emp.name + " salary is higher than threshold");
            }
        }
        highestSalary(employees);
    }

    static void highestSalary(ArrayList<Employee> employees){
        if(employees.size() != 0){
            double highest = employees.get(0).monthlySalary;
            String empName = employees.get(0).name;
            for(Employee emp: employees){
                if (emp.monthlySalary > highest){
                    highest = emp.monthlySalary;
                }
            }
            System.out.println("Name: " + empName + ", salary: " + highest +  ", earns more than everyone ");
        }
    }

}
