package com.cly;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author IBM
 * @Date 2020/10/22
 **/
public class AAA {static int m;
    static{
        m=888;
    }
}

class E{
    public static void main(String[] args){
        AAA a =null;
        System.out.printf("%d:%d",AAA.m, AAA.m);
    }
}

