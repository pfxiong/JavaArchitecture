package com.ctyun.pattern.strategy.t2;

/**
 * 描述:高级客户
 * @author xiongpf
 * @create 20180723 20:27
 */
public class AdvanceCustomer implements MemberShopping {

    @Override
    public double pay(double price) {
        return price * 0.5;
    }
}
