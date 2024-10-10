package it.unibo.ddd.exercises.money;

public interface Money {
    double getValue();
    Currency getCurrency();

    void setValue();
}
