package com.ctyun.pattern.factory.t4;

import com.ctyun.pattern.factory.BaoMaCar;
import com.ctyun.pattern.factory.BiYaDiCar;
import com.ctyun.pattern.factory.Car;
import com.ctyun.pattern.factory.FaLaLiCar;

public class CarFactory extends AbstractFactory {
    @Override
    public Car getBaoMaCar() {
        return new BaoMaCar();
    }

    @Override
    public Car getBiYaDiCar() {
        return new BiYaDiCar();
    }

    @Override
    public Car getFaLaLiCar() {
        return new FaLaLiCar();
    }
}
