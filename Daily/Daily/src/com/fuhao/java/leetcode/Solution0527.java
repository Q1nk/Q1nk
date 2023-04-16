package com.fuhao.java.leetcode;

/*
    leetcode 面试题 17.11. 单词距离
    模拟
 */
public class Solution0527 {
    public static void main(String[] args) {

    }

    public int findClosest(String[] words, String word1, String word2) {
        if (words.length < 2) {
            return 0;
        }
        int minDis = Integer.MAX_VALUE;
        for (int i = 0, wordsOneIdx = -1, wordsTwoIdx = -1; i < words.length; i++) {
            if (words[i].equals(word1)) wordsOneIdx = i;
            if (words[i].equals(word2)) wordsTwoIdx = i;
            if (wordsOneIdx != -1 && wordsTwoIdx != -1) {
                minDis = Math.min(minDis, Math.abs(wordsOneIdx - wordsTwoIdx));
            }
        }
        return minDis;
    }
}
