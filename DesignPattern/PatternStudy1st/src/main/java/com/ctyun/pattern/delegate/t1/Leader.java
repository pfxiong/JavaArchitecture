package com.ctyun.pattern.delegate.t1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiongpf
 * @desc 项目经理
 * @create 20180724 19:52
 */
public class Leader {

    //维护各个员工的信息
    public Map<String, IWorker>  doMap = new HashMap<String, IWorker>();

    public  Leader(){
        doMap.put("软件测试", new SoftwareTester());
        doMap.put("编码", new SoftwareProgramer());
    }

    public void  dothing(String command){
        doMap.get(command).dothing(command);
    }

}
