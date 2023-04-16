package com.fuhao.java.leetcode;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lastOne(1000));
    }

    public static int lastOne(int m) {
        int result = 0;
        for (int i = 2; i <= m; i++) {
            result = (result + 3) % i;
        }
        return result;
    }



}
