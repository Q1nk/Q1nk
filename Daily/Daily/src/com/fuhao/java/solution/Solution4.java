package com.fuhao.java.solution;

import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        int[] arr = {-1,5,-7,2,-1,0,7,6,2,4};
        int k = kConcatenationMaxSum(arr, 5);
        System.out.println(k);
    }

    public static int kConcatenationMaxSum(int[] arr, int k) {
        int arrLength = arr.length;
        if (0 == arrLength) {
            return 0;
        }
        int[] newArr = new int[k * arrLength];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < k; j++) {
                newArr[i + j * arrLength] = arr[i];
            }
        }
        int result = 0;
        int newArrMaxNum = Arrays.stream(newArr).max().getAsInt();
        for (int i = 0; i < newArr.length; i++) {
            int temp = newArr[i];
            for (int j = i + 1; j < newArr.length; j++) {
                temp += newArr[j];
                result = Math.max(temp, result);
            }
        }
        result = Math.max(result, newArrMaxNum);
        return result;
    }
}
