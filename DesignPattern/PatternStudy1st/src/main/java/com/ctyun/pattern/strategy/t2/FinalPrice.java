package com.ctyun.pattern.strategy.t2;

/**
 * 描述:打折后价格
 * @author xiongpf
 * @create 20180723 20:28
 */
public class FinalPrice {

    private MemberShopping memberShopping;

    public FinalPrice(MemberShopping memberShopping){
        this.memberShopping = memberShopping;
    }

    public  double calPrice(double markedprice){
       return this.memberShopping.pay(markedprice);}
}
