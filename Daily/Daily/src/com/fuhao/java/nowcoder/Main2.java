package com.fuhao.java.nowcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String p = br.readLine();
        String t = br.readLine();

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == t.charAt(0) && (i+t.length() <= p.length())) {
                if (p.substring(i, i + t.length()).equals(t)) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
