package com.company.creational.factoryMethod.model;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by car!");
    }
}
