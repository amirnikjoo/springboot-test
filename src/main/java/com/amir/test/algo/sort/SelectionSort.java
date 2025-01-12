package com.amir.test.algo.sort;

import com.amir.test.dto.SampleOutputDto;

import java.util.Arrays;

public class SelectionSort {  //O(n^2)

    public static void main(String[] args) {
        int[] a = new int[]{8, 7, 9, 2, 3, 1, 5, 4, 6};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void selectionSort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {  //find min index
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            int tmpIndex = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmpIndex;
        }
    }
}
