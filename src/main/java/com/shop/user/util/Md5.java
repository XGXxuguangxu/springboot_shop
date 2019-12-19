package com.shop.user.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Md5
{
    /**
     * 密码加密
     * @param
     */
    public static String MD5Pwd(String password) throws NoSuchAlgorithmException {
        //获取密码md5值
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 计算md5函数
        md.update(password.getBytes());
        // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
        // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
        String md5_passwd=new BigInteger(1, md.digest()).toString(16);
        return md5_passwd;
    }
    /**
     * @author wangmeng
     * @date 2019/12/17 16:43
     */

    public static String getMd5(String plainText,int length) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            // 32位
            // return buf.toString();
            // 16位
            // return buf.toString().substring(0, 16);

            return buf.toString().substring(0, length);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static int getRandomCode(){
        int max=9999;
        int min=1111;
        Random random = new Random();
        return random.nextInt(max)%(max-min+1) + min;
    }
    public static void main(String[] args) {
        System.out.println(Md5.getMd5("helloadsfdsffsf",6));
        System.out.println(getRandomCode());
    }



}
