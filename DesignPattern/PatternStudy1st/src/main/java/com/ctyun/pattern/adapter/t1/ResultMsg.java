package com.ctyun.pattern.adapter.t1;

/**
 * @author xiongpf
 * @desc 结果信息
 * @create 20180724 20:50
 */
public class ResultMsg {

    private String code;
    private String msg;
    private Object data;

    public ResultMsg(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
