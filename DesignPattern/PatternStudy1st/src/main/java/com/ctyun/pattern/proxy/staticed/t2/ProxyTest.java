package com.ctyun.pattern.proxy.staticed.t2;

/**
 * 描述:
 * @author xiongpf
 * @create 20180719 21:14
 */
public class ProxyTest {

    public static void main(String[] args) {

        MeiPo meiPo = new MeiPo(new Son());
        meiPo.findLove();
    }
}
