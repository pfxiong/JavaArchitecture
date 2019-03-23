package com.ctyun.pattern.observer.t2;

import java.util.Observable;

/**
 * @author xiongpf
 * @desc 被观察者
 * @create 20180731 21:39
 */
public class ServerManager extends Observable {

    private int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int i) {
        if (this.data != i) {
            this.data = i;
            setChanged();
        }
        notifyObservers();  //只有在setChange()被调用后，notifyObservers()才会去调用update()，否则什么都不干。
    }
}
