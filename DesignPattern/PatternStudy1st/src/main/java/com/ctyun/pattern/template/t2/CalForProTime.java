package com.ctyun.pattern.template.t2;

/**
 * 描述:
 *
 * @author xiongpf
 * @create 20180724 9:13
 */
public class CalForProTime extends CalProTime {

    public void exePro() {
        long sum = 0 ;
        for(int i=0; i< 1000; i++){
            sum = + i;
            try {
                Thread.sleep(100);
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        CalProTime calProTime = new CalForProTime();
        System.out.println(calProTime.calTime());
    }
}
