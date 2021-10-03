package com.company.creational.factoryMethod.service;

import com.company.creational.factoryMethod.model.Car;
import com.company.creational.factoryMethod.model.Transport;

public class CarTransportCreator extends TransportCreator {
    @Override
    protected Transport createTransport() {
        return new Car();
    }
}
