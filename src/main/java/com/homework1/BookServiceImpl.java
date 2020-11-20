package com.homework1;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class BookServiceImpl implements BookService{
    @Override
    public boolean checkbook(Book book) throws BookNameException, PriceException, LengthException {
        if(book.getLength()!=13) {
            throw new LengthException("书名号错误！！");
        }else if (book.getName().equals("暴力恐怖")) {

            throw new BookNameException("含有禁词！");
        }
            else if
        (book.getPrice()>100){

            throw new BookNameException("价格过高！");
        }

         else {
             return false;
        }}


    }

