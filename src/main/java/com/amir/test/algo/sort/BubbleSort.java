package com.amir.test.algo.sort;

import java.util.Arrays;

public class BubbleSort {  //O(n^2)

    public static void main(String[] args) {
//        int[] a = new int[]{1};
        int[] a = new int[]{8, 7, 9, 2, 3, 1, 5, 4, 6};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len -1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
