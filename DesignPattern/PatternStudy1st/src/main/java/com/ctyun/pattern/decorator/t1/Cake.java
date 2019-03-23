package com.ctyun.pattern.decorator.t1;

/**
 * @author xiongpf
 * @desc
 * @create 20180731 20:10
 */
public abstract class Cake {
    String remark = "蛋糕";

    public String getRemark() {
        return remark;
    }

    //用来描述吃蛋糕的感觉
    public abstract String getImpression();
}
