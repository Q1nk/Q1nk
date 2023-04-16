package com.fuhao.java.nowcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        String word = br.readLine();
        Set<String> result = new HashSet<>();
        for (int i = 0; i < split.length; i++) {
            if (split[i].charAt(split[i].length()-1) == ',') {
                split[i] = split[i].substring(0, split[i].length() - 1);
            }
            if (split[i].substring(0, isTwoPart(split[i])).startsWith(word)){
                result.add(split[i].substring(0, isTwoPart(split[i])));
            }
            if (isTwoPart(split[i]) != split[i].length() && split[i].substring(isTwoPart(split[i])+1).startsWith(word)) {
                result.add(split[i].substring(isTwoPart(split[i])+1));
            }
        }

        if (result.isEmpty()) {
            System.out.println(word);
        } else {
            Set<String> sortedSet = new TreeSet<>(Comparator.reverseOrder());
            Set<String> sortedSet2 = new TreeSet<String>((o1, o2) -> o2.compareTo(o1));
            result.stream().sorted().collect(Collectors.toList()).forEach(i-> System.out.println(i+" "));
            sortedSet.addAll(result);
        }
    }

    public static  int isTwoPart(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\'') {
                return i;
            }
        }
        return str.length();
    }
}
