package com.ctyun.pattern.factory.t1;


import com.ctyun.pattern.factory.BaoMaCar;
import com.ctyun.pattern.factory.BiYaDiCar;
import com.ctyun.pattern.factory.Car;
import com.ctyun.pattern.factory.FaLaLiCar;

/*
小作坊，生产车
 */
public class SimpleFactory {

    public Car getCar(String name){

        if(name.equals("BiYaDi")){
            return new BiYaDiCar();
        }
        else if(name.equals("BaoMa")){
            return new BaoMaCar();
        }
        else if(name.equals("FaLaLi")) {
            return new FaLaLiCar();
        }
        else {
            System.out.println("Sorry，We have no car you need!");
            return null;
        }

    }
}
