package com.ctyun.pattern.template.t1;

/**
 * 描述:
 * 1.一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
 * 2.各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。
 * @author xiongpf
 * @create 20180724 9:01
 */
public class BankTemplateTest {

    public static void main(String[] args) {
        BankTemplate bankTemplate = new QuQian();
        bankTemplate.process();
    }
}
