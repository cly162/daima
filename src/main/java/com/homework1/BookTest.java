package com.homework1;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class BookTest {
    public static void main(String[] args) {
        Book book=new Book("教科局",2222,20);
        BookService ss=new BookServiceImpl();

        boolean flag=false;
        try{
            flag=ss.checkbook(book);
        }catch (LengthException | BootstrapMethodError | PriceException | BookNameException e){
            System.err.println(e.getMessage());
        }
        System.out.println(flag);

    }
}








