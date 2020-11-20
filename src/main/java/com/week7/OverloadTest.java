package com.week7;

/**
 * @ClassName OverloadTest
 * @Description TODO
 * @Author IBM
 * @Date 2020/10/22
 **/
public class OverloadTest {
    public static int sum(int a, int b) {
        //ctrl+shift+enter复
        return a + b;

    }

    public static  String sum(String s1,String s2,String s3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s1);
        stringBuilder.append(s2);
        stringBuilder.append(s3);
        return stringBuilder.toString();
        //return s1+s2+s3;

    }
    //计算两个秒数相加的结果
    public static String add(int a, int b) {
        a = a + b;
        int s, m, hour;
        m = a / 60;
        s = a % 60;
        hour = m / 60;
        m = m % 60;
        return hour + "时" + m + "分" + s + "秒";

    }

    public static void main(String[] args) {
        System.out.println(add(50,30));
    }


    }


