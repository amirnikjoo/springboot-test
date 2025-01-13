package com.amir.test.algo.sort;

public class InsertionSort {
    // large dataset is bad
    // less steps compare to bubble sort
    // best scenario is O(n) compared to selection sort O(n^2)

    public static void main(String[] args) {
        int[] array = new int[]{6,3,4,7,8,5,2,1,9};

        insertSort(array);

        for(int i : array)
            System.out.print(i + " ");
    }

    private static void insertSort(int[] array) {
        // after comparing elements to the left
        // shift elements to the right to make room to inset a value

        int len = array.length;
        for (int i = 1; i < len; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j >= 0 && tmp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
    }
}
