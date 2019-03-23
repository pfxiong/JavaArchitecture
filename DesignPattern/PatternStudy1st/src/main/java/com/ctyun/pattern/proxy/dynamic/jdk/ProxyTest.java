package com.ctyun.pattern.proxy.dynamic.jdk;

import com.ctyun.pattern.proxy.staticed.t2.Person;

/**
 * @author xiongpf
 * @create 20180719 8:06
 */
public class ProxyTest {

    public static void main(String[] args) {

       try {
           Person obj = (Person)new JDKMeiPo().getInstance(new XiaoMing());
           System.out.println(obj.getClass());
           obj.findLove();
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
    }
}
