package com.cly.week1;

import lombok.*;

/**
 * @ClassName Phone
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
public class Phone {
    private String brand;
    private Integer price;
}
