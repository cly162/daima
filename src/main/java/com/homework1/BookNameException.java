package com.homework1;

/**
 * @ClassName Student
 * @Description 书名中包含暴力恐怖等禁词
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class BookNameException extends Exception {
   public  BookNameException(String message){
       super(message);
   }
}
