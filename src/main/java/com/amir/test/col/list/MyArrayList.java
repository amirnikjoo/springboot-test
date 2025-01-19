package com.amir.test.col.list;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
//      Insertion   > O(1)    worst O(n)
//      removal     > O(1)    worst O(n)
//      Retrieval   > O(1)


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        for (String s : list) {
            System.out.println("s = " + s);
        }

    }

}
