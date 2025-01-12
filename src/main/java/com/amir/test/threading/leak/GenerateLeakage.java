package com.amir.test.threading.leak;

import java.util.ArrayList;
import java.util.List;

public class GenerateLeakage {
    public static void main(String[] args) {
        List<int[]> memoryLeakList = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
           memoryLeakList.add(new int[1000]);
        }
    }

}