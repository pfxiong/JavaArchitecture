package com.ctyun.pattern.decorator.t1;

/**
 * @author xiongpf
 * @desc 坚果装饰器
 * @create 20180731 20:22
 */
public class NutsDecorator extends Decorator{

    public NutsDecorator(Cake cake) {
        //调用父类的构造方法，可以获取Cake的实例了。就可以调用Cake实例的方法
        super(cake);
        super.remark = "坚果";
    }

    @Override
    public String getRemark() {
        return cake.getRemark() + "+" + super.remark;
    }

    //实现了装饰器抽象类的getImpression方法。
    //这是重点。我们通过构造方法传入的cake实例，对cake进行了装饰，增加了新的功能。
    @Override
    public String getImpression() {
        return super.cake.getImpression() + "," + "加上坚果，香脆可口";
    }

}
