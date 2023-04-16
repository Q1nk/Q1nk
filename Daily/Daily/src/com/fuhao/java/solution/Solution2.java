package com.fuhao.java.solution;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int[] stepOneResult = stepOne(5);
        int[] stepTwoResult = stepTwo(stepOneResult);
        int[] result = stepThree(stepTwoResult);

    }
    public static int[] stepOne(int num) {
        int[] result = new int[13];
        if (num >= 0) {
            for (int i = result.length - 2; i >= 0; i--) {
                result[i] = result[i + 1] + num;
            }
        }else {
            for (int i = 1; i < result.length; i++) {
                result[i] = result[i - 1] - num;
            }
        }
        return result;
    }
    public static int[] stepTwo(int[] num) {
        int[] result = new int[13];
        if (num[0] == num[1]) {
            Arrays.fill(result, 7);
        }
        if (num[0] > num[1]) {
            for (int i = 0; i < result.length; i++) {
                result[i] = i + 7;
            }
        } else {
            for (int i = 0; i < result.length; i++) {
                result[i] = 19 - i;
            }
        }
        return result;
    }

    public static int[] stepThree(int[] num) {
        int[] result = new int[2];
        if (num.length < 2) {
            return num;
        }
        Arrays.fill(result,Integer.MAX_VALUE);
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == 41) {
                    if (result[0] + result[1] > i + j) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        if (result[0] == Integer.MAX_VALUE) {
            result[0] = num[0];
            result[1] = num[1];
        }
        return result;
    }

}
