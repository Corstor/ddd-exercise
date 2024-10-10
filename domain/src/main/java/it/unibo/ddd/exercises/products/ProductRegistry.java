package it.unibo.ddd.exercises.products;

public interface ProductRegistry {
    Iterable<Product> getAllProducts();

    Product findProductById(ProductId productId);

    void addNewProduct(Product product);

    void updateProduct(Product product);

    void removeProduct(Product product);
}
