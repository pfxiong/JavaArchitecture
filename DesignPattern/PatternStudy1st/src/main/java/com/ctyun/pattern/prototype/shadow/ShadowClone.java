package com.ctyun.pattern.prototype.shadow;

/**
 * 描述:浅拷贝
 * @author xiongpf
 * @create 20180716 22:04
 */
public class ShadowClone implements Cloneable {
        // 基本类型
        private int a;
        // 非基本类型
        private String b;
        // 非基本类型
        private int[] c;

        @Override
        public Object clone() {
            ShadowClone sc = null;
            try {
                sc = (ShadowClone) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return sc;
        }

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
