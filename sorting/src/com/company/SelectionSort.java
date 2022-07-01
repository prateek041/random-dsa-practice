package com.company;


import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
	int [] arr = {3, 4, -1, 5, 7, 0};
    selection(arr);
    System.out.println(Arrays.toString(arr));
    }

    // select the largest/smallest  number and swap it with its correct index.
    static void selection(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max in the remaining array.
            int last = arr.length-i-1;
            // on every iteration, last index is filled with the max value of that subarray. so we decrease the subarray
            // for checking 'max' value by 1, on every iteration.
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }

        }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int maxIndex, int last){
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}


