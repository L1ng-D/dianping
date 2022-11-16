package com.hmdp.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class String2Txt {

    public static void write(String s) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\test.txt", true));
        pw.println(s);
        pw.close();
    }

    public static void main(String[] args) {
        try {
            String2Txt.write("aaaaa");
            String2Txt.write("bbbb");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
