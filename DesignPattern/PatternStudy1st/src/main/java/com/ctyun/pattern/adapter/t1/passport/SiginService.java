package com.ctyun.pattern.adapter.t1.passport;

import com.ctyun.pattern.adapter.t1.Member;
import com.ctyun.pattern.adapter.t1.ResultMsg;

/**
 * @author xiongpf
 * @desc 登录服务
 * @create 20180724 20:52
 */
public class SiginService {

    public ResultMsg regist(String username, String password){
        return  new ResultMsg("200","注册成功",new Member());
    }


    public ResultMsg login(String username,String password){
        return null;
    }

}
