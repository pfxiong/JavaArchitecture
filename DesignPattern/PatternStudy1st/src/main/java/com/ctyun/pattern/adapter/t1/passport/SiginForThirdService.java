package com.ctyun.pattern.adapter.t1.passport;

import com.ctyun.pattern.adapter.t1.ResultMsg;

/**
 * @author xiongpf
 * @desc
 * @create 20180724 20:53
 */
public class SiginForThirdService extends SiginService {

    public ResultMsg loginForQQ(String openId){
        //1、openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）
        //4、调用原来的登录方法
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId){
        return loginForRegist(openId,null);
    }


    public ResultMsg loginForTelphone(String telphone,String code){
        return loginForRegist(telphone,null);
    }

    public ResultMsg loginForRegist(String username,String password){
        super.regist(username,null);
        return super.login(username,null);
    }
}
