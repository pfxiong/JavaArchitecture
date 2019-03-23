package com.ctyun.pattern.strategy.t1;

/**
 * 描述:支付类型
 * @author xiongpf
 * @create 20180722 11:28
 */
public enum PayType {

    ALI_PAY(new AliPay()),
    UNION_PAY(new UnionPay()),
    JD_PAY(new JDPay());

    private PayType(Payment payment){
        this.payment = payment;
    }

    private Payment payment;

    public Payment getPayment(){ return  this.payment; }

}
