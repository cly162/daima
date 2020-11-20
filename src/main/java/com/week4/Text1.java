package com.week4;

import java.io.*;
import java.io.IOException;

public class Text1 {
    public static void main(String[] args) throws IOException {
        File r1 = new File("D:\\Adobe.txt");
        Reader reader =new FileReader(r1);
        char[] b =new char[(int) r1.length()];
        int read = reader.read(b);
        File d1 = new File("D:\\1.txt");
        Writer writer = new FileWriter(d1);
        writer.write(b);
        reader.close();
        writer.close();
    }
}
