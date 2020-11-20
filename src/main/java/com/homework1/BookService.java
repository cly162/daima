package com.homework1;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public interface BookService {
    boolean checkbook(Book book) throws BookNameException,PriceException,LengthException;
}
