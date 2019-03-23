package com.ctyun.pattern.observer.t2;

/**
 * @author xiongpf
 * @desc
 * @create 20180731 21:43
 */
public class Test {

    public static void main(String[] args) {
        ServerManager sm = new ServerManager();
        AObserver a = new AObserver(sm);
        BObserver b = new BObserver(sm);
        sm.setData(5);

        sm.deleteObserver(a); //注销观察者，以后被观察者有数据变化就不再通知这个已注销的观察者
        sm.setData(10);
    }
}
