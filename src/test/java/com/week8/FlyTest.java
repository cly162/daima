package com.week8;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class FlyTest {

    Fly fly = new Bird();

    @Test
    public void fly(){
        fly.fly("大雁",60);
        fly=new Plane();
        System.out.println("======");
        fly.fly("大灰机",15220);
    }
}