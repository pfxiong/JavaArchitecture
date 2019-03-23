package com.ctyun.pattern.proxy.staticed.t2;

/**
 * 描述:
 * @author xiongpf
 * @create 20180719 7:31
 */
public class MeiPo  {

    private Son son;

    public MeiPo(Son son){
        this.son = son;
    }

    public void findLove(){
        System.out.println("找对象");
    }

}
