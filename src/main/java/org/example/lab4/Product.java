package org.example.lab4;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private int stock;

    public Product(int productId, String productName, double productPrice, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stock = stock;
    }

    public void addStock(int num){
        if(num > 0){
            stock += num;
        }
    }

    public void buy(int quantity){
        double amountDue;
        if(quantity > 0 && stock >= quantity){
            stock -= quantity;
            amountDue = quantity * productPrice;
            System.out.println("Amount Due = " + amountDue);
        }
    }
}
