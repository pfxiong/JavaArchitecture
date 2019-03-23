package com.ctyun.pattern.strategy.t1;

/**
 * 描述:支付描述
 * @author xiongpf
 * @create 20180722 11:24
 */
public class PayState {

    private int code;
    private String msg;
    private Object data;

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
