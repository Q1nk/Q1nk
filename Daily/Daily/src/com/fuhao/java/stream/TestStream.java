package com.fuhao.java.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("12.3", "3.43", "jbfek", "dguqi");
        list.stream().limit(2).sorted().map(str -> str + "ok").forEach(System.out::println);
        System.out.println(list.stream().limit(2).mapToDouble(Double::parseDouble).sum());

        StringBuffer stringBuffer = new StringBuffer();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("fhe");
        linkedList.add("fhe1");
        linkedList.add("fhe2");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        linkedList.forEach(System.out::println);
    }
}
