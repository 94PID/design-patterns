package com.company.creational.factoryMethod.model;

public class Boat implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by boat!");
    }
}
