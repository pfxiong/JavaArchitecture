package com.ctyun.pattern.observer.t2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xiongpf
 * @desc  观察者一
 * @create 20180731 21:41
 */
public class AObserver implements Observer {

    public AObserver(ServerManager sm) {
        super();
        sm.addObserver(this); //注册加入观察者
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        System.out.println("AObserver receive:Data has changed to " + ((ServerManager) arg0).getData());

    }

}