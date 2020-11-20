package com.week8;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class Bird implements Fly {
    @Override
    public void fly(String name, int speed) {
        System.out.println(Fly.NAME+","+Fly.SPEED);
        System.out.println(name+"飞行器，时速"+speed);
    }
}
