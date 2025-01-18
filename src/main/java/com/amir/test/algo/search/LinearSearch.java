package com.amir.test.algo.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {9,7,3,9,6,4,1,2};

        int index = linearSearch(array, 1);
        System.out.println("index = " + index);
    }

    private static int linearSearch(int[] array, int target) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == target) {
                return j;
            }
        }
        return -1;
    }

}
