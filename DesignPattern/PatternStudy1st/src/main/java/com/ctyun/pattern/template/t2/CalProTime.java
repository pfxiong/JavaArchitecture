package com.ctyun.pattern.template.t2;

/**
 * 描述:
 *
 * @author xiongpf
 * @create 20180724 9:09
 */
public abstract class CalProTime {

    //不变的部分定义为模板, 方法定义为final
    public final long calTime(){
        long start= System.currentTimeMillis();
         exePro();
        long end = System.currentTimeMillis();
        return (end-start);
    }

    public abstract void exePro();
}
