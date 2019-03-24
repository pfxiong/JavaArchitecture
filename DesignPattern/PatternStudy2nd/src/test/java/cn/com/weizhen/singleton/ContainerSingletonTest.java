package cn.com.weizhen.singleton;

import cn.com.weizhen.singleton.register.ContainerSingleton;

/**
 * 容器式单例
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj = ContainerSingleton.getInstance("cn.com.weizhen.singleton.Pojo");
                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            }, 10,6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
