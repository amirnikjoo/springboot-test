package com.amir.test.algo.sort;

public class QuickSort {
    // moves smaller elements to left of a pivot
    // recursively divide array to 2 partitions
    // best,average NLogN, worst case O(n^2) if already sorted
    //space complexity = O(Log(n)) due to recursion

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 2, 4, 7, 1, 3, 9, 6, 5};
        int n = array.length;
        quickSort(array, 0, n - 1);
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

