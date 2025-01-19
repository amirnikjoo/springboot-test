package com.amir.test.col.list;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
//      Insertion   > O(1)
//      removal     > O(1)
//      Retrieval   > O(n)


    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add(null);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add(null);
        int i = 0;
        for (String s : list) {
            System.out.println(i++ + " ,s = " + s);
        }

    }

}
