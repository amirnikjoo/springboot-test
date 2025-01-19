package com.amir.test.col.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyVector {
// complexity is like ArrayList but little slower because of  ##SYNCHRONIZATION
//      Insertion   > O(1)    worst O(n)
//      removal     > O(1)    worst O(n)
//      Retrieval   > O(1)


    public static void main(String[] args) {
        List<String> list = new Vector<>();
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
