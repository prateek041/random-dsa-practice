package com.company;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5};
        int index = 1;
        System.out.println(isSorted(arr, index));
    }

    static boolean isSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index-1] > arr[index]){
            return false;
        }
        index++;
        return isSorted(arr, index);
    }
}
