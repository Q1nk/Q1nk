package com.fuhao.java.nowcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            time[i] = Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
        }
        Arrays.sort(time);
        int[] times = new int[time[time.length - 1] + 1];
        int[][] dp = new int[n][2];
        dp[time[0]][0] = 0;
        dp[time[0]][1] = 1;

        for (int i = time[0]; i < time.length; i++) {
            times[time[i]] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[i][0] = Math.max(dp[i - m][0], dp[i - m][1]);
            dp[i][1] = Math.max(dp[i - m][1], dp[i - m][0] + 1);
        }
        System.out.println(Math.max(dp[time[time.length - 1]][0], dp[time[time.length - 1]][1]));
    }
}
