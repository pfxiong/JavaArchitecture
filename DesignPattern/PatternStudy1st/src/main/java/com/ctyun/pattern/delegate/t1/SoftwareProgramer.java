package com.ctyun.pattern.delegate.t1;

/**
 * @author xiongpf
 * @desc 程序员
 * @create 20180724 19:50
 */
public class SoftwareProgramer implements IWorker {

    @Override
    public void dothing(String command) {
        System.out.println("我是程序猿，我要进行"+command);
    }
}
