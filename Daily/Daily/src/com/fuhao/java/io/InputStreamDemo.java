package com.fuhao.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("tt.txt");

        int read;
        while ((read = fileInputStream.read()) != -1) {
            fileOutputStream.write(read);
        }

        fileOutputStream.close();
        fileInputStream.close();
    }
}