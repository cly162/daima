package com.cly.week1;

import lombok.*;

import java.util.List;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 29180
 * @Date 2020/10/15
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Student {
    private  String id;
    private  String studentName;
    private  String gender;
    private  Phone phone;
    private List<Book> bookList;

}
