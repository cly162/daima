package com.week9;

import java.util.Scanner;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class RuntimeExceptionTest {
    public static void main(String[] args) {
        //1.ArithmeticException 算数异常
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.err.println("除数不能为0!!");
            //    e.printStackTrace();
            //    System.err.println(e.getMessage());
            //    System.err.println(e.getCause());
            //    System.err.println(e);
            //    e.printStackTrace();
            //    JOptionPane.showMessageDialog(null,"除数不能为0");
            //System.out.println("其他代码段");
        }
        System.out.println("****************");


        //2.从键盘输入一串字符，将其转为整形输出
        System.out.println("please input: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int result = 0;

        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println("数字格式化异常");
        } finally {
            //应用场景：关闭数据库连接、线程资源的释放、流的关闭
            System.out.println("finish");
            scanner.close();
        }

        System.out.println(result);
        System.out.println("***********");

        //3.仿照完成ArrayIndexOutOfBoundsException的异常处理
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组访问越界了");
        }


        //4.关于空指针异常NullPointerException(NPE)的问题
        String s = " ";
        if("admin".equals(s)) {
            System.out.println("success");
        }else{
            System.out.println("failure");
        }

            if(s==null||"".equals(s))

        {
            System.out.println("账号不能为空");
        }
    }

}







