package org.example.lab1;

public class TemperatureConverter {
    static void main() {
        convertToFahrenheit(32);
        convertToCelsius(89.6);
    }



    static void convertToFahrenheit(double celsius){
        double fahrenheit;
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " to fahrenheit = " + fahrenheit);
    }

    static void convertToCelsius(double fahrenheit){
        double celsius;
        celsius = (fahrenheit * 5) / 9 - 32;
        System.out.println(fahrenheit + " to celsius = " + celsius);

    }
}
