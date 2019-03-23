package com.ctyun.pattern.strategy.t1;

/**
 * 描述:支付宝
 * @author xiongpf
 * @create 20180722 11:30
 */
public class AliPay implements Payment {

    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,"支付成功", amount);
    }

}
