package com.company.creational.prototype;

import com.company.creational.prototype.model.SportCar;

public class Main {

    public static void main(String[] args) {

        SportCar sportCar = new SportCar();

        sportCar.setCage(true);
        sportCar.setTireType("slick");

        SportCar sportCar1 = (SportCar) sportCar.clone();

        if (sportCar == sportCar1) {
            System.out.println("The same reference!");
        }

        if (sportCar.equals(sportCar1)) {
            System.out.println("Equal object after cloning (different ref)");
        }

    }

}
