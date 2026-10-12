package org.example;

public class TemperatureConverter {
    public double celsius = 9;
    public double fahrenheit;

    public void convertToFahrenheit(){
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println();
    }
}
