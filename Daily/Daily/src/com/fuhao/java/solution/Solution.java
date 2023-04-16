package com.fuhao.java.solution;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.isRationalEqual("0.11666(66)", "0.116(6)"));

    }

    public boolean isRationalEqual(String s, String t) {

        String[] ss = s.split("\\.");
        String[] tt = t.split("\\.");

        int sIntgerPart = Integer.parseInt(ss[0]);
        int tIntgerPart = Integer.parseInt(tt[0]);

        double sLittlePart = toLittleNum(ss);
        double tLittlePart = toLittleNum(tt);

        return Math.abs(sIntgerPart - tIntgerPart + sLittlePart - tLittlePart) < 0.00000001;
    }

    public double toLittleNum(String[] num) {
        if (0 == num[1].length()) {
            return 0;
        }
        double b = 0;
        double c = 0;
        for (int i = 0; i < num[1].length(); i++) {
            if ('(' == num[1].charAt(i)) {
                if (i > 0) {
                    b = (double) Integer.parseInt(num[1].substring(0, i)) / Math.pow(10, i);
                }
                String s = num[1].substring(i + 1, num[1].length() - 1);
                c = (double) Integer.parseInt(s) / (Math.pow(10, i) * (Math.pow(10, s.length()) - 1));
                break;
            }
            if (i == num[1].length() - 1) {
                b = (double) Integer.parseInt(num[1]) / Math.pow(10, num[1].length());
            }
        }
        return b + c;
    }
}
