package com.homework1;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class Book {
    private String name;
    private Integer length;
    private Integer price;
    Book(String name,Integer length,Integer price){
        this.name=name;
        this.length=length;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}


