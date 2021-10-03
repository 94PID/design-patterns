package com.company.creational.factoryMethod;

import com.company.creational.factoryMethod.model.Car;
import com.company.creational.factoryMethod.model.Transport;
import com.company.creational.factoryMethod.service.BoatTransportCreator;
import com.company.creational.factoryMethod.service.CarTransportCreator;
import com.company.creational.factoryMethod.service.TransportCreator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Which transport you want to use ? (car | boat)");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String transportType = reader.readLine();

        if (transportType.equals("car")) {
            TransportCreator creator = new CarTransportCreator();
            creator.deliveryOrchestration();
        } else {
            TransportCreator creator = new BoatTransportCreator();
            creator.deliveryOrchestration();
        }

    }

}
