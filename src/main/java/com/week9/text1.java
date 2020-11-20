package com.week9;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class text1 {
    public static void fanhui() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            double a = Math.random() * 100;
            int b = (int) a;
            System.out.println(b);
            Thread.sleep(300);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        fanhui();
    }
}
