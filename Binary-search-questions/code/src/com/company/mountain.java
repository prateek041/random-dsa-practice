package com.company;

public class mountain {
    public static void main(String[] args) {
        int [] arr = {0, 10, 5, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    // there is no target here.
    // find the mid of the array, if the mid+1 is greater than mid, start = mid+1.
    // if the mid+1 of the array is smaller than mid, end = mid-1.

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length+1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid + 1] > arr[mid]) {
                // here we are assigning mid+1 because it is greater than mid. and we have to find the greatest element.
                start = mid + 1;
            } else {
                // here we are not assigning mid-1 because this might be the potential greatest element.
                end = mid;
            }
        }
        return end;
    }
}
