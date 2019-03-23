package com.ctyun.pattern.factory.t3;

import com.ctyun.pattern.factory.BaoMaCar;
import com.ctyun.pattern.factory.Car;

public class BaoMaFactory  extends Factory {

    @Override
    Car getCar() {
        return new BaoMaCar();
    }
}
