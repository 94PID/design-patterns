package com.company.creational.factoryMethod.service;

import com.company.creational.factoryMethod.model.Boat;
import com.company.creational.factoryMethod.model.Transport;

public class BoatTransportCreator extends TransportCreator {
    @Override
    protected Transport createTransport() {
        return new Boat();
    }
}
