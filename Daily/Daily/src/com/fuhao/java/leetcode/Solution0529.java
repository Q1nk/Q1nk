package com.fuhao.java.leetcode;

/*
    leetcode 468. 验证IP地址
    ipv4 ipv6分别校验，分割时注意用split(":",-1) 用以保存分割字符串中的空值
 */
public class Solution0529 {
    public static void main(String[] args) {
        String ip1 = "172.16.00.1";
        String ip2 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        System.out.println(validIPAddress(ip1));
        System.out.println(validIPAddress(ip2));
    }

    public static String validIPAddress(String queryIP) {
        if (queryIP.contains(".") && checkIPv4(queryIP)) {
            return "IPv4";
        }
        if (queryIP.contains(":") && checkIPv6(queryIP)) {
            return "IPv6";
        }
        return "Neither";
    }

    public static boolean checkIPv4(String IPv4) {
        String[] splitIPv4 = IPv4.split("\\.", -1);
        if (splitIPv4.length != 4) {
            return false;
        }
        for (String tmp : splitIPv4) {
            if (tmp.length() == 0 || tmp.length() > 3 || (tmp.length() > 1 && tmp.charAt(0) == '0')) {
                return false;
            }
            int sum = 0;
            for (int i = 0; i < tmp.length(); i++) {
                if (!Character.isDigit(tmp.charAt(i))) {
                    return false;
                }
                sum = sum * 10 + tmp.charAt(i) - '0';
            }
            if (sum > 255) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIPv6(String IPv6) {
        String[] splitIPv6 = IPv6.split(":", -1);
        if (splitIPv6.length != 8) {
            return false;
        }
        for (String tmp : splitIPv6) {
            if (tmp.length() == 0 || tmp.length() > 4) {
                return false;
            }
            for (int i = 0; i < tmp.length(); i++) {
                char tmpChar = tmp.charAt(i);
                if (!(tmpChar >= '0' && tmpChar <= '9') && !(tmpChar >= 'a' && tmpChar <= 'f') && !(tmpChar >= 'A' && tmpChar <= 'F')) {
                    return false;
                }
            }
        }
        return true;
    }
}
