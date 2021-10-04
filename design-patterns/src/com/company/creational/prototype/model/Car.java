package com.company.creational.prototype.model;

public abstract class Car {

    String make;
    String model;
    int horsepower;

    public Car() {}

    public Car(Car car) {
        this.make = car.make;
        this.model = car.model;
        this.horsepower = car.horsepower;
    }

    public abstract Car clone();


}
