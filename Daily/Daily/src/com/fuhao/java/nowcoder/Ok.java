package com.fuhao.java.nowcoder;

public class Ok {
    public static void main(String[] args) {
        String str = "diaw'fauh";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\'' && str.substring(i+1).startsWith("fa")) {
                System.out.println(str.substring(i+1));
                System.out.println("jj");
            }
        }
    }
}
