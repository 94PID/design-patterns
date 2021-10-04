package com.company.creational.simpleBuilder;

import com.company.creational.simpleBuilder.model.Car;

public class Main {


    public static void main(String[] args) {

        Car car = new Car.Builder().setHorsepower(1000).setMake("Lambo").setModel("Aventador").setColor("Yellow").build();
        System.out.println(car);

    }

}
