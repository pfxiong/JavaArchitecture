package com.ctyun.pattern.adapter.t1;

import com.ctyun.pattern.adapter.t1.passport.SiginForThirdService;

/**
 * @author xiongpf
 * @desc  适配器模式测试
 * @create 20180724 20:57
 */
public class SiginForThirdServiceTest {

    public static void main(String[] args) {
        SiginForThirdService siginForThirdService = new SiginForThirdService();
        siginForThirdService.loginForQQ("2122893");
    }
}
