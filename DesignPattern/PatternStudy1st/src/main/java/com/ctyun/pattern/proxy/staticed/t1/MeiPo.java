package com.ctyun.pattern.proxy.staticed.t1;

/**
 * 描述:
 * @author xiongpf
 * @create 20180717 9:30
 */
public class MeiPo {

    private Person person;

    //不便于扩展
    public MeiPo(Person person){
        this.person = person;
    }

    public void findFriend(){

        System.out.println("根据双方条件物色");
        this.person.findFriend();
        System.out.println("双方父母是否同意");
    }

}
