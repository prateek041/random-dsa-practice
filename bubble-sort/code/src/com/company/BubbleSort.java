package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
//        int [] arr = {10, 22, 1, 7, 0, 33, 89};
        int [] arr = {30, 20, 10, 5, 4, -32, -22, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    // in every step, we are comparing adjacent elements. and swapping them if condition of max or min is satisfied.
    // when the array is already sorted, we don't need to traverse the array for every value.
    static void bubble(int [] arr){
        // start with the first number, compare it with others, swap if condition satisfied.
        int temp = 0;
        boolean change = false;
        for(int i = 0 ; i<arr.length; i++){
            for (int numc = 1; numc < arr.length-i; numc++) {
                if(arr[numc]>arr[numc-1]){
                    temp = arr[numc-1];
                    arr[numc-1] = arr[numc];
                    arr[numc] = temp;
                    change = true;
                }
                }
            // the array is sorted if no swaps were done for an entire value of i.
            if(!change){
                return;
            }
        }
    }

}
