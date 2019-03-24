package cn.com.weizhen.singleton.hungry;

/**
 * @author fpxiong
 * @description: TODO
 * @date 2019/3/2411:38
 */
//饿汉式静态块单例
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}
    public static HungryStaticSingleton getInstance(){
        return  hungrySingleton;
    }
}
