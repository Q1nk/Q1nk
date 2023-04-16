package com.fuhao.java.leetcode;

public class Solution9 {
    public static void main(String[] args) {

        String[] str = {"abc", "abc", "abc"};
        System.out.println(longestHead(str));

    }

    public static String longestHead(String[] str) {
        if (str.length == 0) {
            return "";
        }
        String result = str[0];
        for (int i = 1; i < str.length; i++) {
            int j = 0;
            for (; j < result.length() && j < str[i].length(); j++) {
                if (result.charAt(j) != str[i].charAt(j)) {
                    break;
                }
            }
            result = result.substring(0, j);
            if (result.equals(" ")) {
                return result;
            }
        }
        return result;
    }
}
