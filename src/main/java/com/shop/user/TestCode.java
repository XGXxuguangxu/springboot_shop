package com.shop.user;

import java.util.Random;

public class TestCode {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 999999;//最大数
        int min = 100000;//最小数
        int code = random.nextInt(max);//随机生成
        System.out.println(code);
        if (code < min) {
            code = code + min;
        }
        System.out.println(  "收到验证码是：" + code);
    }
}
