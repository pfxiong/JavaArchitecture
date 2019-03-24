package cn.com.weizhen.singleton.register;

/**
 * @author fpxiong
 * @description: 枚举单例模式，最安全
 * @date 2019/3/2411:38
 */
//常量中去使用，常量不就是用来大家都能够共用吗？
//通常在通用API中使用
public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
