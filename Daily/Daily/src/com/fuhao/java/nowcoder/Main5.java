package com.fuhao.java.nowcoder;

import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
        System.out.println(extraNum("kur1su alan0233"));
    }

    public static ArrayList<Integer> extraNum (String s) {
        // write code here
        ArrayList<Integer> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                temp.append(s.charAt(i));
            } else {
                if (temp.length() != 0) {
                    result.add(Integer.parseInt(temp.toString()));
                }
                temp = new StringBuilder();
            }
        }
        if (temp.length() != 0) {
            result.add(Integer.parseInt(temp.toString()));
        }
        return result;
    }
}
