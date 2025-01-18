package com.amir.test.algo.search;


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i *2;
        }

        int b = Arrays.binarySearch(array, 98);
        System.out.println("item found in: " + b);

    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int counter = 0;

        while (low <= high){
            counter++;
            int mid = (low + high) / 2;
            if (array[mid] == target){
                System.out.println("times = " + counter);
                return mid;
            } else if (array[mid] < target){
                low = mid + 1;
            } else if (array[mid] > target){
                high = mid - 1;
            }
        }
        System.out.println("item not found, counter = " + counter);
        return -1;
    }
}
