package com.ctyun.pattern.strategy.t2;

/**
 * 描述:普通客户
 * @author xiongpf
 * @create 20180723 20:26
 */
public class CommonCustomer implements MemberShopping{
    @Override
    public double pay(double price) {
        return price * 0.9;
    }
}
