package com.cly.week1;


import lombok.*;

import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO
 * @Author 29180
 * @Date 2020/10/15
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Book {
    private String bookName;
    private Integer value;
    private Date f;
}


