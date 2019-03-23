package com.ctyun.pattern.decorator.t1;

/**
 * @author xiongpf
 * @desc
 * @create 20180731 20:33
 */
public class FruitDecorator extends Decorator{

    public FruitDecorator(Cake cake){
        super(cake);
        super.remark = "水果";
    }

    @Override
    public String getRemark() {
        return cake.getRemark() + "+" + super.remark;
    }

    @Override
    public String getImpression() {
        return super.cake.getImpression() + "," + "加上水果，味道好极了";
    }
}
