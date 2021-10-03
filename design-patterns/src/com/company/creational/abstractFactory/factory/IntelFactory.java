package com.company.creational.abstractFactory.factory;

import com.company.creational.abstractFactory.model.CPU;
import com.company.creational.abstractFactory.model.GPU;
import com.company.creational.abstractFactory.model.IntelCpu;
import com.company.creational.abstractFactory.model.IntelGpu;

public class IntelFactory implements PcFactory {

    @Override
    public GPU createGPU() {

        System.out.println("Intel GPU creation");
        return new IntelGpu();
    }

    @Override
    public CPU createCPU() {
        System.out.println("Intel CPU creation");
        return new IntelCpu();
    }
}
