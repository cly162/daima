package com.week4;

import java.io.*;
import java.util.Arrays;


/**
 * @author IBM
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //1.将源文件读入内存数组
        File file1 = new File("C:\\Users\\IBM\\Pictures\\Saved Pictures\\005TVywUly1ft9x6kf43gj30hs09eadp.jpg");
        InputStream is = new FileInputStream(file1);
        byte[] b= new byte[(int) file1.length()];
        int readResult=is.read(b);
        System.out.println(Arrays.toString(b));
        System.out.println(readResult);

        //2.将内存数组中的值写到目标文件
        File file2 = new File("C:\\Users\\IBM\\Pictures\\Saved Pictures\\1.jpg");
        OutputStream os = new FileOutputStream(file2);
        os.write(b);
        os.close();
        is.close();
     }



}
