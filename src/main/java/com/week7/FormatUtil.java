package com.week7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ClassName FormatUtil
 * @Description TODO
 * @Author IBM
 * @Date 2020/10/22
 **/
public class FormatUtil{
        //ctrl+shift+t
    public static String format(LocalDate date) {

        return Stringformat(date);
    }

    private static String Stringformat(LocalDate date) {
        return "";
    }

    public static  String test(int a,int b)  {
        return a+b+"";

}
public static void main(String[] args){
        System.out.println(LocalDateTime.now());
    System.out.println(new Date());
}
}
