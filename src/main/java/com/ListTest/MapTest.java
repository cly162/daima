package com.ListTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class MapTest { public static void main(String[] args) {
    Map<String, String> map = new HashMap<String, String>();

    map.put("Tom", "CoreJava");
    map.put("John", "Oracle");
    map.put("Susan", "Oracle");
    map.put("Jerry", "Unix");
    map.put("Jim", "JSP");
    map.put("Kevin", "JSP");
    map.put("Lucy", "CoreJava");

    map.put("Allen", "JDBC");
    //Lucy改为教CoreJava
    Set<Map.Entry<String, String>> entrySet = map.entrySet();
    for (Map.Entry<String, String> entry : entrySet) {
        String key = entry.getKey();
        if (key.equals("Lucy")) {
            entry.setValue("JDBC");
        }
    }

    //方式一  获取结婚证对象，调用结婚证对象的getKey getValue
    for (Map.Entry<String, String> entry : entrySet) {
        System.out.println("老师：" + entry.getKey() + "  课程：" + entry.getValue());
    }

    //方式二 获取所有键，调用map的get(key),根据键拿值
    Set<String> set = map.keySet();
    for (String key : set) {
        String value = map.get(key);
        System.out.println("老师：" + key + "  课程：" + value);
    }

    //输出所有教JDBC的老师
    for (Map.Entry<String, String> entry : entrySet) {
        if (entry.getValue().equals("JDBC")) {
            System.out.println(entry.getKey());
        }
    }
}
}
