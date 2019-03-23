package com.ctyun.pattern.singleton.t3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 描述:BeanFactory
 * @author xiongpf
 * @create 20180715 19:42
 */
public class BeanFactory {

    private BeanFactory(){
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public  static  Object getBean(String className){

        if(ioc.containsKey(className)){
            return ioc.get(className);
        }
        else{
            try {
                Object obj = Class.forName(className).newInstance();
                ioc.put(className, obj);
            }catch (Exception ex){
                ex.printStackTrace();
            }

            return ioc.get(className);
        }
    }

}
