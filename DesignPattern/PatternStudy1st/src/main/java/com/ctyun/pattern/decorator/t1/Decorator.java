package com.ctyun.pattern.decorator.t1;

/**
 * @author xiongpf
 * @desc 装饰器
 * @create 20180731 20:18
 */
public abstract class Decorator extends  Cake{

    Cake cake;

    public Decorator(Cake cake){
        this.cake = cake;
    }

    public abstract String getRemark();
}
