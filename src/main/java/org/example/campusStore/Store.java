package org.example.campusStore;

import java.util.ArrayList;

public class Store {
    public static ArrayList<Product> cart = new ArrayList<>();

    static void main() {
        buy(stock(), 1, 3);
        buy(stock(), 2, 5);
        buy(stock(), 3, 2);

        displayInvoice();
    }

    public static ArrayList<Product> stock(){
        Product apple = new Product(1, "Apple", 2, 15);
        Product banana = new Product(2, "Banana", 1, 15);
        Product cabbage = new Product(3, "Cabbage", 10, 15);
        Product onion = new Product(4, "Onion", 3, 15);
        Product watermelon = new Product(5, "Watermelon", 15, 15);

        ArrayList<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(banana);
        products.add(cabbage);
        products.add(onion);
        products.add(watermelon);

//        for (Product product: products){
//            product.displayDetails();
//        }

        return products;

    }

    public static Product searchProduct(ArrayList<Product> products, int productId){
        for (Product product: products){
            if(product.getProductId() == productId){
                return product;
            }
        }
        return null;
    }

    public static boolean inStock(int quantity, Product product){
        if(quantity <= product.getStock()){
            return true;
        }
        return false;
    }

    public static double buy(ArrayList<Product> products, int productId, int quantity){
        Product product = searchProduct(products, productId);
        double total = 0;
        if(products.contains(product)){
            product.displayDetails(quantity) ;
            if(inStock(quantity, product)){
                total = product.getProductPrice() * quantity;
                cart.add(product);
                product.decreaseStock(quantity);
            }
        }
        return total;
    }

    public static void displayInvoice(){
        double subTotal = 0;
        double discount = 0;
        double total;

        for (Product item: cart){
            subTotal += item.getProductPrice();
        }

        if(subTotal > 10){
            discount = subTotal * 0.1;
        }
        total = subTotal - discount;
        System.out.println("Invoice");
        System.out.println("Subtotal: R" + subTotal);
        System.out.println("Discount: R" + discount);
        System.out.println("Ammount due: R" + total);
    }

}
