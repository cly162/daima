package com.ListTest;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class SetTest {
    public  static void main (String[] args){
        String[] s={"TypeScript","Java","Java","JavaScript"};
       //1.创建Set集合对象（TreeSet实现类）
       Set<String> set=new TreeSet<>(Arrays.asList(s));
        System.out.println(set);

        set.forEach(System.out::println);
        //2.使用treeSet求两个排序数组的中位数
        //[4,3,2,2,6],[10,9,8,8,2,3,1]
        //合并后的去重排序为：[1,2,3,4,6,7,8,9,10]
        //中位数：6
        Integer[] a ={4,3,2,2,6};
        Integer[] b = {10,9,8,8,2,3,1};

        Set<Integer> set1 = new TreeSet<Integer>(Arrays.asList(a));
        Set<Integer> set2 = new TreeSet<Integer>(Arrays.asList(b));
        set1.addAll(set2);
//        set1.forEach(System.out::println);
        Integer[] arr = set1.toArray(new Integer[0]);
        System.out.println(arr.length);
        int mid = arr.length / 2;
        System.out.println(mid);
        if(arr.length%2==1) {
            System.out.println(arr[mid]);
        }else{
            System.out.println((arr[mid]+arr[mid-1])/2);
        }
    }


    }

