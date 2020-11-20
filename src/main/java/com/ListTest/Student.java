package com.ListTest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 29180
 * @Date 2020/11/19
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Student implements Comparable<Student>{
    private String name;
    private Integer age;
    private String gender;
    private Integer num;
    @Override
    public int compareTo(Student o) {
        return this.getAge().compareTo(o.getAge());
    }
}
