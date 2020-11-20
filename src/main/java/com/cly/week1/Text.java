package com.cly.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Text
 * @Description TODO
 * @Author IBM
 * @Date 2020/10/22
 **/


public class Text {
    public static void main(String[] args) {
        Student student= Student.builder()
                .studentName("Cly")
                .id("2002922227")
                .gender("male")
                .phone(Phone.builder().brand("苹果20").price(3200).build())
                .build();
        Book[] books={
                Book.builder().bookName("java").value(54).build(),
                Book.builder().bookName("javaWeb").value(54).build(),
                Book.builder().bookName("javaScript").value(54).build(),
        };
        List<Book> bookList=new ArrayList(Arrays.asList(books));
        student.setBookList(bookList);
        for (Book book : student.getBookList()) {
            System.out.println(book.getBookName());
        }
    }
}

