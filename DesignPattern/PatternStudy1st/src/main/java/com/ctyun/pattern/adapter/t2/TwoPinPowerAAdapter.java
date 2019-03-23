package com.ctyun.pattern.adapter.t2;

/**
 * @author xiongpf
 * @desc
 * @create 20180724 21:07
 */
public class TwoPinPowerAAdapter implements TwoPinPowerA {

    private ThirdPinPowerB powerB;//要进行适配的接口

    public TwoPinPowerAAdapter(ThirdPinPowerB powerB) {
        this.powerB = powerB;
    }

    //实现接口PowerA，则必然要实现PowerA里面的方法
    public void insert() {
        powerB.connect();
    }
}
