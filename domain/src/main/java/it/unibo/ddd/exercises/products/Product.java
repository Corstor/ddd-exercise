package it.unibo.ddd.exercises.products;

import it.unibo.ddd.exercises.money.Money;

public interface Product {
    ProductId getProductId();

    Money getPrice();
    int getAvailability();

    void setPrice(Money price);
    void setAvailability(int availability);
}
