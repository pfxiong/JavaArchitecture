package com.ctyun.pattern.decorator.t1;

/**
 * @author xiongpf
 * @desc
1.装饰类实际就是一个为原有类增添新功能的模式（也可以为原功能删除，但是得是原类方法级层次上的，方法体内是不可以的）。
2.装饰类其实也把核心的功能和装饰的功能分开了。
  装饰模式主要采用构造器的方式输入原对象，为原对象动态添加删除方法。而代理模式主要是在代理中就已经实例化了原类的生成原对象
  这样代理对象就隐藏了原对象的信息，对于原对象的访问都是通过代理对象进行访问，控制了对原对象的访问方式（装饰模式在运行时动态调用原对象，
  而代理模式在编译时期就已经new了原对象）。
 * @create 20180731 20:26
 */
public class Client {

    public static void main(String[] args) {
        /* Cake nutsCreamCake = new NutsDecorator(
                new CreamCake());
        System.out.println("remark:" + nutsCreamCake.getRemark());
        //吃蛋糕的感受发生改变
        System.out.println("impression:"
                + nutsCreamCake.getImpression());*/

        /* Cake nutsIceCake = new NutsDecorator(
                new IceCake());
        System.out.println("remark:" + nutsIceCake.getRemark());
        //吃蛋糕的感受发生改变
        System.out.println("impression:"
                + nutsIceCake.getImpression());*/

        Cake fruitIceCake = new FruitDecorator(
                new IceCake());
        System.out.println("remark:" + fruitIceCake.getRemark());
        //吃蛋糕的感受发生改变
        System.out.println("impression:" + fruitIceCake.getImpression());
    }
}
