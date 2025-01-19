package com.amir.test.col.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
// PriorityQueue
//      Insertion   > O(log(n))
//      removal     > O(log(n))
//      Retrieval   > O(1)


    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
//        queue.add(null); not allowed
        queue.add("b");
        queue.add("c");
        queue.add("a");

        queue.offer("d");
        for (String s : queue) {

        }


    }
}
