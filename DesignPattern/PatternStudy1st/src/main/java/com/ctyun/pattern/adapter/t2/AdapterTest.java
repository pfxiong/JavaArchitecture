package com.ctyun.pattern.adapter.t2;

/**
 * @author xiongpf
 * @desc
 *  适配器模式（ Adapter ）：将一个类的接口转换成客户希望的另外一个接口。
    适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * @create 20180724 21:09
 */
public class AdapterTest {

    public static void main(String[] args) {
        //电源A开始工作
        TwoPinPowerA twoPinPowerA = new TwoPinPowerAImpl();
        start(twoPinPowerA);
        ThirdPinPowerB powerB = new ThirdPinPowerBImpl();
        TwoPinPowerAAdapter pa = new TwoPinPowerAAdapter(powerB);
        start(pa);
    }

    //定义方法：电源A工作
    public static void start(TwoPinPowerA powerA) {
        powerA.insert();
    }


}
