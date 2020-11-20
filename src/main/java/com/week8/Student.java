package com.week8;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class Student implements Mycomparbale{
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public int compareTo(Object obj) {
        Student other =(Student)obj;
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name+" and "+age;
    }
}

