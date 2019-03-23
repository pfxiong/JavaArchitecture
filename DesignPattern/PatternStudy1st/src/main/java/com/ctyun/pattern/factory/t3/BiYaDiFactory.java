package com.ctyun.pattern.factory.t3;

import com.ctyun.pattern.factory.BiYaDiCar;
import com.ctyun.pattern.factory.Car;

public class BiYaDiFactory extends Factory {

    @Override
    Car getCar() {
        return new BiYaDiCar();
    }
}
