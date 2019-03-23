
package com.ctyun.pattern.singleton.t3;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述: 注册登记式单例
 * @author xiongpf
 * @create 20180715 17:31
 */
public class RegisterMap {

    private  RegisterMap(){

    }

    private static Map<String, Object> registerMap = new HashMap<String, Object>();

    public static RegisterMap getInstance(String name) {
        if(name==null){
            name = RegisterMap.class.getName();
        }

        if (registerMap.get(name) == null) {
            registerMap.put(name, new RegisterMap());
        }

        return (RegisterMap) registerMap.get(name);
    }

}
