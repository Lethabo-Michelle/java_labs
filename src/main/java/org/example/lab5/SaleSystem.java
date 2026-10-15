package org.example.lab5;

import java.util.ArrayList;

public class SaleSystem {
    static void main() {
        ArrayList<Product> products  = new ArrayList<>();
        Product item1 = new Product("Apple", 5, 25);
        Product item2 = new Product("Banana", 2, 20);
        Product item3 = new Product("Watermelon", 20, 15);
        Product item4 = new Product("Orange", 15, 30);
        products.add(item1);
        products.add(item2);
        products.add(item3);
        products.add(item4);
        calculateTotal(products);
    }

    public static void calculateTotal(ArrayList<Product> products){
        double total = 0;
        double discount = 0;
        for (Product product: products){
            double amount = product.price * product.quantity;
            System.out.println(product.name + " R" + product.price + " * " + product.quantity + " = R" + amount);
            total += amount;
        }
        System.out.println("Subtotal: " + total);

        if(total > 1000){
            discount = (total * 0.1);
        }
        System.out.println("Discount: " + discount);
        System.out.println("Total amount due: " + (total - discount));
    }

}
