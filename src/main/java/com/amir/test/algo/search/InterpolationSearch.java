package com.amir.test.algo.search;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int index = interpolationSearch                (array, 4);
        if (index == -1){
            System.out.println("item not found");
        } else {
            System.out.println("item found at index " + index);
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        while (low <= high && value >= array[low] && value <= array[high]) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe = " + probe);
            if (array[probe] == value) {
                return probe;
            } else if (array[probe] > value) {
                high = probe - 1;
            } else
                low = probe + 1;
        }

        return -1;
    }
}
