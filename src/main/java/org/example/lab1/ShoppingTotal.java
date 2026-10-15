package org.example.lab1;

public class ShoppingTotal {

    public void displayTotal(String productName, double unitPrice, int quantity){
        System.out.println(productName + ": R" + (unitPrice * quantity));
    }
}
