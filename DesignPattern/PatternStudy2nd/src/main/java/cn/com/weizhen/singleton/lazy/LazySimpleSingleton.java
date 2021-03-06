package cn.com.weizhen.singleton.lazy;

/**
 * @author fpxiong
 * @description: 懒汉式单例
 * @date 2019/3/2411:38
 */

//懒汉式单例
//在外部需要使用的时候才进行实例化
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    //静态块，公共内存区域
    private static LazySimpleSingleton lazy = null;

    public synchronized static LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
