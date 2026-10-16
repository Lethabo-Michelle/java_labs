package org.example.campusStore;

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

    public void decreaseStock(int num){
        if(num > stock){
            System.out.println("We have " + stock + " " + productName + " in stock.");
        }
        stock -= num;
    }

    public int getStock() {
        return stock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void displayDetails(int quantity){
        System.out.println(productId + "." + productName + ": R" + productPrice + " * " + quantity);
    }
}
