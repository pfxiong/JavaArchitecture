package com.ctyun.pattern.delegate.t1;

/**
 * @author xiongpf
 * @desc 测试
 * @create 20180724 19:48
 */
public class SoftwareTester implements IWorker {

    @Override
    public void dothing(String command) {
        System.out.println("我是软件测试人员，我要进行"+command);
    }
}
