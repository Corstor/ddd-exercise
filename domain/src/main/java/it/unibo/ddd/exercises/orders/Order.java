package it.unibo.ddd.exercises.orders;

import java.util.Dictionary;

import it.unibo.ddd.exercises.products.Product;

public interface Order {
    int getSerialId();
    Dictionary<Product, Integer> getOrderedProducts();
    void addProduct(Product product, int quantity);
    void removeProduct(Product product);
}
