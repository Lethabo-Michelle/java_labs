package org.example.lab5;

import java.util.ArrayList;

public class SaleSystem {
    static void main() {
        ArrayList<Product> products  = new ArrayList<>();
        Product item1 = new Product("Apple", 5, 25);
        Product item2 = new Product("Banana", 2, 20);
        Product item3 = new Product("Watermelon", 20, 15);
        Product item4 = new Product("Orange", 5, 30);
        item1.productDetails();
        products.add(item1);
        products.add(item2);
        products.add(item3);
        products.add(item4);
    }


}
