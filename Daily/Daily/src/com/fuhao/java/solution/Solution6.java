package com.fuhao.java.solution;

public class Solution6 {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs));
    }

    public static int minOperations(String[] logs) {
        if (logs == null) {
            return 0;
        }
        int result = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                result = Math.max(0, result - 1);
            }else if (!log.equals("./")) {
                result++;
            }
        }
        return result;
    }
}
