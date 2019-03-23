package com.ctyun.pattern.decorator.t1;

/**
 * @author xiongpf
 * @desc
 * @create 20180731 20:12
 */
public class CreamCake extends Cake {

    public  CreamCake(){
         super.remark = "奶油蛋糕";
    }

    @Override
    public String getImpression() {
        return "奶油蛋糕，奶香油滑";
    }
}
