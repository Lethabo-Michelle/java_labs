package org.example;

public class ShoppingTotal {
    public String productName = "Bread";
    public double unitPrice = 19.50;
    public int quantity = 5;

    public void displayTotal(){
        System.out.println(productName + ": R" + (unitPrice * quantity));
        System.out.println();
    }
}
