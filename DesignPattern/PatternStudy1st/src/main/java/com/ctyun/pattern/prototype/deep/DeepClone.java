package com.ctyun.pattern.prototype.deep;

import java.io.Serializable;

/**
 * 描述:深拷贝
 * @author xiongpf
 * @create 20180716 22:57
 */
public class DeepClone implements Serializable {

    private int a;
    private String b;
    private int[] c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int[] getC() {
        return c;
    }

    public void setC(int[] c) {
        this.c = c;
    }

}
