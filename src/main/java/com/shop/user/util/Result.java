package com.shop.user.util;

/**
 * @ClassName Result
 * @description: result
 * @author: xuguangxu
 * @create: 2019/12/10
 */
public class Result<T> {

    //是否成功
    private boolean flag;

    //返回码
    private Integer code;

    //返回信息
    private  String message;

    //返回数据
    private T data;

    public Result(boolean flag, Integer code, String message, T data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public Result() {

    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
