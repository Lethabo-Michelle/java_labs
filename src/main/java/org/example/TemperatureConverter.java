package org.example;

public class TemperatureConverter {
    public double fahrenheit;

    public void convertToFahrenheit(double celsius){
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("fahrenheit = " + fahrenheit);
    }
}
