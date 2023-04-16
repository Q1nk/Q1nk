package com.fuhao.java.solution;

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        int[] num = {3, 6, 9, 1, 2, 6};
        int stepOneResult = stepOne(num);
        int[] stepTwoResult = stepTwo(stepOneResult);
        int stepThreeResult = stepThree(stepTwoResult);
        System.out.println(stepThreeResult);

    }

    public static int stepOne(int[] prices) {
        int n = prices.length;
        if (n < 2) {
            return 0;
        }
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - 3);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[n - 1][0];
    }

    public static int[] stepTwo(int num) {
        int[] result = new int[11];
        if (0 == num) {
            Arrays.fill(result, 49);
        }
        result[10] = 49;
        for (int i = result.length - 2; i >= 0; i--) {
            result[i] = result[i + 1] + num;
        }
        return result;
    }

    public static int stepThree(int[] num) {
        if (0 == num.length) {
            return 0;
        }
        if (1 == num.length) {
            return num[0];
        }
        int result = 0;
        for (int i = 0; i <= 5; i++) {
            double inx = 49 / Math.pow(2, i);
            int index = (int) inx;
            if (num.length >= index) {
                result = num[index - 1];
                break;
            } else {
                continue;
            }
        }
        return result;
    }
}
