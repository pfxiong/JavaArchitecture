package com.ctyun.pattern.prototype.deep;

import java.io.*;

/**
 * 描述: 深克隆后:改动dc1或者dc2,不管是基本类型还是引用类型,他们的值都不会随着一方改变而改变。
 * 这样做的前提就是对象以及对象内部全部引用到的对象都是可序列化的。
 * @author xiongpf
 * @create 20180716 23:00
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        DeepCloneTest t = new DeepCloneTest();
        DeepClone dc1 = new DeepClone();

        // 对dc1赋值
        dc1.setA(100);
        dc1.setB("clone1");
        dc1.setC(new int[]{1000});
        System.out.println("克隆前: dc1.a=" + dc1.getA());
        System.out.println("克隆前: dc1.b=" + dc1.getB());
        System.out.println("克隆前: dc1.c[0]=" + dc1.getC()[0]);
        System.out.println("-----------");

        DeepClone dc2 = (DeepClone) t.deepClone(dc1);

        // 对c2进行改动
        dc2.setA(50);
        dc2.setB("clone2");
        int[] a = dc2.getC();
        a[0] = 500;
        dc2.setC(a);

        System.out.println("克隆前: dc1.a=" + dc1.getA());
        System.out.println("克隆前: dc1.b=" + dc1.getB());
        System.out.println("克隆前: dc1.c[0]=" + dc1.getC()[0]);

        System.out.println("-----------");

        System.out.println("克隆后: dc2.a=" + dc2.getA());
        System.out.println("克隆后: dc2.b=" + dc2.getB());
        System.out.println("克隆后: dc2.c[0]=" + dc2.getC()[0]);
    }

    public Object deepClone(Object src) {
        Object o = null;
        try {
            if (src != null) {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(src);
                oos.close();

                ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bais);
                o = ois.readObject();
                ois.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return o;
    }
}
