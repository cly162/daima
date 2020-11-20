package com.week8;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
class MycomparbaleTest {
    Mycomparbale m;

    @Test

    void compareTo() {
        News new1 =new News(1256,"大事件",1000);
        News new2 =new News(1253,"大事",10);
        m=new1;
        int result =m.compareTo(new2);
        System.out.println(result);


        System.out.println("222222");

        Student s1 =new Student("asd",15);
        Student s2 =new Student("asdw",13);
        m=s1;
        result=m.compareTo(s2);
        System.out.println(result);

    }
}