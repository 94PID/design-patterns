package com.company.creational.prototype.model;

import java.util.Objects;

public class SportCar extends Car {

    boolean cage;
    String tireType;

    public SportCar() {
    }


    public SportCar(SportCar sportCar) {
        super(sportCar);
        this.cage = sportCar.cage;
        this.tireType = sportCar.tireType;
    }

    public boolean isCage() {
        return cage;
    }

    public void setCage(boolean cage) {
        this.cage = cage;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    @Override
    public Car clone() {
        return new SportCar(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportCar)) return false;
        SportCar sportCar = (SportCar) o;
        return isCage() == sportCar.isCage() && Objects.equals(getTireType(), sportCar.getTireType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCage(), getTireType());
    }
}
