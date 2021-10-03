package com.company.creational.abstractFactory;

import com.company.creational.abstractFactory.factory.IntelFactory;
import com.company.creational.abstractFactory.factory.NvidiaFactory;
import com.company.creational.abstractFactory.factory.PcFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static PcFactory getFactory(String name) {
        if (name.equals("intel")) {
            PcFactory pcFactory = new IntelFactory();
            return new IntelFactory();
        } else {
            return new NvidiaFactory();
        }
    }


    public static void main(String[] args) throws IOException {

        System.out.println("Which factory you want to use ? (intel || nvidia)");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String type = reader.readLine();

        PcFactory pcFactory = getFactory(type);

        // There is a separation between creation and business logic
        // At this point we don't care which factory we need
        pcFactory.createCPU();
        pcFactory.createCPU();

    }

}
