package com.fuhao.java.solution;

public class Solution5 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(kConcatenationMaxSum(arr, 3));
    }

    public static int kConcatenationMaxSum(int[] arr, int k) {
        if (0 == arr.length) {
            return 0;
        }
        int sum = 0;
        int dp = 0;
        int total = 0;
        for (int i = 0; i < Math.min(2, k) * arr.length; i++) {
            sum = Math.max(arr[i % arr.length], sum + arr[i % arr.length]);
            dp = Math.max(sum, dp);
            if (i < arr.length) {
                total += arr[i];
            }
        }
        while (total > 0 && --k >= 2) {
            dp = (dp + total) % 1000000007;
        }
        return dp % 1000000007;
    }
}
