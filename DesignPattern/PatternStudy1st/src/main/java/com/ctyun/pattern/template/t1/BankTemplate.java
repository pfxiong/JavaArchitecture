package com.ctyun.pattern.template.t1;

/**
 * 描述:去银行办理业务模板
 * @author xiongpf
 * @create 20180723 21:02
 */
public abstract class BankTemplate {

    /**
     * 排队取号
     */
    public final void getNum() {
        System.out.println("排队取号");
    }

    /**
     * 办理具体业务定义为抽象方法，供子类实现
     */
    public abstract void exeTask();

    /**
     * 评价
     */
    public final void evaluate() {
        System.out.println("为工作人员评价打分");
    }

    /**
     * 去银行办理业务所有步骤，整套流程
     */
    public final void process() {
        getNum();
        exeTask();
        evaluate();
    }
}
