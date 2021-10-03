package com.company.creational.abstractFactory.factory;

import com.company.creational.abstractFactory.model.CPU;
import com.company.creational.abstractFactory.model.GPU;

public interface PcFactory {

    public GPU createGPU();

    public CPU createCPU();

}
