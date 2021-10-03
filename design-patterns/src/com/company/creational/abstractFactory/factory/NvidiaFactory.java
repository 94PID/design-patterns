package com.company.creational.abstractFactory.factory;


import com.company.creational.abstractFactory.model.*;

public class NvidiaFactory implements PcFactory {

    @Override
    public GPU createGPU() {
        System.out.println("Nvidia GPU creation");
        return new NvidiaGpu();
    }

    @Override
    public CPU createCPU() {
        System.out.println("Nvidia GPU creation");
        return new NvidiaCpu();
    }
}
