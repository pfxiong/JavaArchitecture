package com.ctyun.pattern.prototype.shadow;

/**
 * 描述:基本类型是能够被克隆的,但引用类型仅仅是copy地址,
 * 并没有copy这个地址指向的对象的值,这使得两个地址指向同一值,改动当中一个,当然还有一个也就变了。
 * 引用类型：数组、类、接口
 * @author xiongpf
 * @create 20180716 22:08
 */
public class ShadowCloneTest {

    public static void main(String[] args) {
        ShadowClone c1 = new ShadowClone();
        //对c1赋值
        c1.setA(100) ;
        c1.setB("clone1") ;
        c1.setC(new int[]{1000}) ;

        System.out.println("克隆前: c1.a="+c1.getA() );
        System.out.println("克隆前: c1.b="+c1.getB() );
        System.out.println("克隆前: c1.c[0]="+c1.getC()[0]);
        System.out.println("-----------") ;

        //克隆出对象c2,并对c2的属性A,B,C进行改动

        ShadowClone c2 = (ShadowClone)c1.clone();

        //对c2进行改动
        c2.setA(50) ;
        c2.setB("clone2");
        int []a = c2.getC() ;
        a[0]=500 ;
        c2.setC(a);

        System.out.println("克隆后: c1.a="+c1.getA() );
        System.out.println("克隆后: c1.b="+c1.getB() );
        System.out.println("克隆后: c1.c[0]="+c1.getC()[0]);
        System.out.println("---------------") ;

        System.out.println("克隆后: c2.a=" + c2.getA());
        System.out.println("克隆后: c2.b=" + c2.getB());
        System.out.println("克隆后: c2.c[0]=" + c2.getC()[0]);
    }
}
