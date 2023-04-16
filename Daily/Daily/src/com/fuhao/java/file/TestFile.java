package com.fuhao.java.file;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        File srcFile = new File("//Users//fuhao//Code//Java");
        getAllFilePath(srcFile);
    }

    public static void getAllFilePath(File srcFile) {
        File[] listFiles = srcFile.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    getAllFilePath(file);
                } else {
                    System.out.println(file.getAbsoluteFile());
                }
            }
        }
    }
}