package org.example;

public class ShoppingTotal {

    public void displayTotal(String productName, double unitPrice, int quantity){
        System.out.println(productName + ": R" + (unitPrice * quantity));
    }
}
