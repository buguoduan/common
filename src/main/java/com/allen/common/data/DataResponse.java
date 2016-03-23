package com.allen.common.data;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/3/23.
 */
public class DataResponse<T> implements Serializable {

    //错误代码
    private int code;
    //返回数据
    private T data;
    //错误消息
    private String msg;

    public static final int SUCCESS = 200;
    public static final int SERVICE_ERROR = 500;

    public DataResponse(int code , T data , String msg){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public DataResponse(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public DataResponse(T data) {
        this();
        this.data = data;
    }

    public DataResponse() {
        this.code = SUCCESS;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
