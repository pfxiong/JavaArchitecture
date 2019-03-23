package com.ctyun.pattern.proxy.custom;

import com.ctyun.pattern.proxy.dynamic.jdk.Person;
import com.ctyun.pattern.proxy.dynamic.jdk.XiaoMing;

/**
 * 描述:
 * @author xiongpf
 * @create 20180720 22:48
 */
public class CustomPorxyTest {

    public static void main(String[] args) {
        try {
            //Person obj = (Person)new CustomMeipo().getInstance(new XiaoMing());
            //System.out.println(obj.getClass());
            //obj.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
