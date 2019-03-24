package cn.com.weizhen.singleton;

import cn.com.weizhen.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * 枚举单例，可以防止反射、序列化造成的破坏
 * 相对其它单例来说，最安全
 */
public class EnumSingletonTest {

    /**
     序列化来验证
     */
//    public static void main(String[] args) {
//        try {
//            EnumSingleton instance1 = null;
//
//            EnumSingleton instance2 = EnumSingleton.getInstance();
//            instance2.setData(new Object());
//
//            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(instance2);
//            oos.flush();
//            oos.close();
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            instance1 = (EnumSingleton) ois.readObject();
//            ois.close();
//
//            System.out.println(instance1.getData());
//            System.out.println(instance2.getData());
//            System.out.println(instance1.getData() == instance2.getData());
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    /**
     反射的方式来验证
     */
    public static void main(String[] args) {
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("Tom",666);
           //从jdk层面就为枚举不被序列化、反射破坏来保驾续航
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}