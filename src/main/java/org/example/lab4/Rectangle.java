package org.example.lab4;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double perimeter(){
        return 2 * (width + height);
    }
}
