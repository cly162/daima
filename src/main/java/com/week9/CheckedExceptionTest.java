package com.week9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class CheckedExceptionTest {
    public static void main(String[] args) {

        //以下两种方式可以得到服务器端long类型的时间戳
        //System.out.println(new Date().getTime());
        long timeStamp = System.currentTimeMillis();
        // System.out.println(System.currentTimeMillis());
        //将其转换为yyyy-MM-dd HH:mm:ss格式,至少用两种方法:Date和LocalDateTime

        //1.格式化对象
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.传入时间戳，创建Date对象
        Date date = new Date(timeStamp);
        //3.格式化date对象
        String str = df.format(date);
        System.out.println(str);
        System.out.println("*********");
        //--------使用loacaldateTimeFormat实现：线程安全---------

        /**
         * 使用loacaldateTime和DateTimeFormat格式时间戳，线程安全
         *
         * @param timeStamp:入参为long类型的时间戳
         * @return String:格式化后的时间字符串
         */
            Instant instant = Instant.ofEpochMilli(timeStamp);
            ZoneId zone = ZoneId.systemDefault();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String result = localDateTime.format(formatter);
            System.out.println("格式化结果为："+result);
            //1.InterruptedException


        }

    }



