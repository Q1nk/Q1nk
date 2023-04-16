package com.fuhao.java.solution;

public class Solution1 {
    public static void main(String[] args) {
        int[] s = stepTwo(1241);

    }

    public static int SetpOne(int[] x) {
        if (0 == x.length) {
            return 4;
        }
        if (4 >= x.length) {
            int reslut = sum(x, 0, x.length - 1);
            return reslut;
        }

        if(isOdd(x.length)) {
            int result = sum(x, x.length / 2 - 2, x.length / 2 + 2);
            return result;
        }else {
            int result = sum(x, x.length / 2 - 2, x.length / 2 + 1);
            return result;
        }

    }

    public static int sum(int[] x, int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) {
            result += x[i];
        }
        return result;
    }

    public static boolean isOdd(int x) {
        if (x % 2 == 1) {
            return true;
        } else {
            return false;
        }

    }

    public static int[] stepTwo(int x) {
        String s = String.valueOf(x);
        int sLength = s.length();
        int[] result = new int[sLength * 4];
        for (int i = 0; i < s.length() - 1; i++) {
            result[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            result[i + s.length()] = Integer.parseInt(String.valueOf(s.charAt(i)));
            result[i + 2 * s.length()] = Integer.parseInt(String.valueOf(s.charAt(i)));
            result[i + 3 * s.length()] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return result;
    }
}
