package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Car car1 = new Car("Red", "Toyota", "Canry", 2021);
        Car car2 = new Car("Blue", "Honda", "Civic", 2020);
        Car car3 = new Car("Green", "Ford", "Mustang", 2019);
        Car[] cars = {car1, car2, car3};
    }
}
