package com.fuhao.java.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;

        String ss = "abcfwuiegtfuiewg";
        byte[] ssBytes = ss.getBytes();

        try {
            fileOutputStream = new FileOutputStream("java.txt");
            fileOutputStream.write(ssBytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
