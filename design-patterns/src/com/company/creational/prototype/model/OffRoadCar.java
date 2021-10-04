package com.company.creational.prototype.model;

public class OffRoadCar extends Car {

    boolean diffLock;

    public OffRoadCar() {}

    public OffRoadCar(OffRoadCar offRoadCar) {
        super(offRoadCar);
        this.diffLock = offRoadCar.diffLock;
    }

    @Override
    public Car clone() {
        return new OffRoadCar(this);
    }
}
