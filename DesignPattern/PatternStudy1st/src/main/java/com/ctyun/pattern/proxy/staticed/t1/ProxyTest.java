package com.ctyun.pattern.proxy.staticed.t1;

import com.ctyun.pattern.proxy.staticed.t1.MeiPo;
import com.ctyun.pattern.proxy.staticed.t1.Person;

/**
 * 描述:
 * @author xiongpf
 * @create 20180719 7:20
 */
public class ProxyTest {

    public static void main(String[] args) {

        MeiPo meiPo = new MeiPo(new Person());
        meiPo.findFriend();
    }
}
