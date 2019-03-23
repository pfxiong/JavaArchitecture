package com.ctyun.pattern.factory.t2;

public class MilkFactory  {

    public  Milk getMilk( String name){
        if(name.equals("mengniu")){
            return new MengniuMilk();
        }
        else if(name.equals("Yini")){
            return new YiniMilk();
        }
        else{
            return null;
        }
    }
}
