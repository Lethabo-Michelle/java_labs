package org.example.lab5;

import java.util.ArrayList;

public class StudentApp {
    static void main() {
        double[] marks = {20, 20, -18};
        StudentResults std1 = new StudentResults("Lethabo", "12345", marks);
        std1.displayDetails();
        std1.hasPassed();

    }

    void passedStudents(ArrayList<StudentResults> students) {
        int count = 0;

        for (StudentResults student : students) {
            if (student.average > 50) {
                count += 1;
            }
        }
        System.out.println(count + " students passed.");
    }
}
