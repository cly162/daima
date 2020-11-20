package com.ListTest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class ListTest {
    public static void main(String[] args){
        String[] s={"Java","JavaScript","Java"};
        List<String> list = Arrays.asList(s);
        System.out.println(list);
        //2.集合的插入操作：在“javascript”后面插入一个元素
        //3.取得新插入的元素
        //4.将刚才插入的元素移除（使用两种移除重载）
        //5.for循环遍历
        System.out.println("for循环遍历");
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        //6.增强型for循环遍历
        System.out.println();
        System.out.println("增强型for循环遍历->推荐");
        for(String str:list){
            System.out.print(str+" ");
        }
        //7.迭代器遍历
        System.out.print("迭代器遍历");
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        //8.Lambda表达式遍历

        System.out.println("Lambda表达式遍历");
        list.forEach(s1 -> {
            System.out.println(s1.toUpperCase());
            System.out.println(s1.toLowerCase());
        });

        //9.方法引用遍历
        System.out.println("终极简洁版本:方法引用遍历->推荐");
        list.forEach(System.out::println);

    }
}
