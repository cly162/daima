package com.ListTest;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class MiddleSorted {
    public void findMiddleSortedNumber(double[] num1, double[] num2) {
        //创建TreeSet 对象
        Set<Double> set = new TreeSet<>();
        //添加数组元素到TreeSet
        for (Double num : num1) {
            set.add(num);
        }
        for (Double num : num2) {
            set.add(num);
        }
        System.out.println(set);
        double mid = 0;
        Object[] result = set.toArray();
        if (set.size() % 2 != 0) {
            mid = (double) result[(int) (result.length / 2.0 + 1)];
        } else {
            mid = (double) result[(int) (result.length / 2.0 - 1)];
        }
        System.out.println(mid);
    }

    public static void main(String[] args) {
        double[] num1 = {2222, 2, 4, 7, 2};
        double[] num2 = {1, 5};
        new MiddleSorted().findMiddleSortedNumber(num1, num2);
    }
}
