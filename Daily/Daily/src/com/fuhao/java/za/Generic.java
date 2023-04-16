package com.fuhao.java.za;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Generic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        char[] ch = data[0].toCharArray();
        System.out.println(ch[2]);
        System.out.println(data[0]);
        br.close();

    }
}
