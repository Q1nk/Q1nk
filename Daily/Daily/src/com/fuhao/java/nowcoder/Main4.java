package com.fuhao.java.nowcoder;

import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {
        System.out.println(countNum(1,11,1));
    }

    public static int countNum (int L, int R, int x) {
        // write code here
        int result = 0;
        for (int i = L; i <= R; i++) {
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                if (String.valueOf(String.valueOf(i).charAt(j)).equals(String.valueOf(x))) {
                    result++;
                }
            }
        }
        return result;
    }
}
