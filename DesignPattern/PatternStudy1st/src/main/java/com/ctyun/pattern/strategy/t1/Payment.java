package com.ctyun.pattern.strategy.t1;

/**
 * 描述:支付
 * @author xiongpf
 * @create 20180722 11:27
 */
public interface Payment {

    PayState pay(String uid, double amount);
}
