package org.example.lab1;

public class ShoppingTotal {
    public static void main() {
        displayTotal("Apple", 5, 10);
    }

    public static void displayTotal(String productName, double unitPrice, int quantity){
        System.out.println(productName + ": R" + (unitPrice * quantity));
    }
}
