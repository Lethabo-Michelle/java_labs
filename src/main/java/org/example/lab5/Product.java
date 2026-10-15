package org.example.lab5;

public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        if (validatePriceAndQuantity(price, quantity)) {
            this.price = price;
            this.quantity = quantity;
        }
        else {
            System.out.println("Invalid price or quantity");
        }
    }

    void productDetails(){
        System.out.println(name + " R" + price + " = " + quantity);
    }

    public boolean validatePriceAndQuantity(double price, int quantity){
        if(price <= 0 || quantity <= 0){
            return false;
        }
        return true;
    }
}
