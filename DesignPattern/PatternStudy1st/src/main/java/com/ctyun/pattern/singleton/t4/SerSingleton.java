package com.ctyun.pattern.singleton.t4;

import java.io.Serializable;

/**
 * 描述:序列化、反序列化单例
 * 在饿汉式基础上，添加readResolve方法
 * @author xiongpf
 * @create 20180715 18:52
 */
public class SerSingleton implements Serializable {

    /*
    //序列化就是把内存中的状态通过转换成字节码的形式
    //从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    //内存中状态给永久保存下来了

    //反序列化
    //讲已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //在转换过程中会重新创建对象
     */

    public  final static SerSingleton INSTANCE = new SerSingleton();

    private SerSingleton(){}

    public static SerSingleton getInstance(){
        return INSTANCE;
    }

    /*
    被反序列化的对象的类存在readResolve这个方法，它会调用这个方法来返回一个“array”，
    然后浅拷贝一份，作为返回值，并且无视掉反序列化的值，即使那个字节码已经被解析。
     */
    private Object readResolve(){
        return  INSTANCE;
    }
}
