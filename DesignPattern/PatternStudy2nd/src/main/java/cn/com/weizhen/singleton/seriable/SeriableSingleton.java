package cn.com.weizhen.singleton.seriable;

import java.io.Serializable;

/**
 * @author fpxiong
 * @description: TODO
 * @date 2019/3/2411:38
 */
//反序列化时导致单例破坏
public class SeriableSingleton implements Serializable {

    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    //内存中状态给永久保存下来了

    //反序列化
    //讲已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //在转换过程中会重新创建对象new

    public  final static SeriableSingleton INSTANCE = new SeriableSingleton();
    private SeriableSingleton(){
    }

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    /*
    重写这个方法，解决序列化单例被破坏的情形，
    只不过覆盖了反序列化出来的对象，还是创建了两次，
    发生在JVM层面，相对来说比较安全
    */
    private  Object readResolve(){
        return  INSTANCE;
    }

}
