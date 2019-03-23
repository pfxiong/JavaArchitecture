package com.ctyun.pattern.decorator.t1;

/**
 * @author xiongpf
 * @desc
 * @create 20180731 20:15
 */
public class IceCake extends Cake {

    public IceCake(){
        super.remark = "冰淇淋蛋糕";
    }

    @Override
    public String getImpression() {
        return "冰淇淋蛋糕,冰凉冰凉";
    }
}
