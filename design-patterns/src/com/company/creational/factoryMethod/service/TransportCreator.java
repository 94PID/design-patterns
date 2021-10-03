package com.company.creational.factoryMethod.service;

import com.company.creational.factoryMethod.model.Transport;

public abstract class TransportCreator {

    public void deliveryOrchestration() {

        System.out.println("Core delivery operation");
        Transport transport = createTransport();
        transport.deliver();
        System.out.println("End of delivery!");
    }


    protected abstract Transport createTransport();

}
