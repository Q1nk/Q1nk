package com.fuhao.java.io;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("java.txt");

        byte[] bytes = new byte[10];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, len));
        }

        fileInputStream.close();
    }
}
