package com.company;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 9, 1, 2, 3};
        System.out.println(search(arr, 0, arr.length-1, 5));
    }

//    static int search(int[] arr, int start, int end, int target){
//        int mid = start + (end-start)/2;
//        if(start > end){ // element not there.
//            return -1;
//        }
//
//        if(target == arr[mid]){ // element found.
//            return mid;
//        }
//        if(arr[start] < arr[mid] && target <= arr[mid]){ // first half is sorted and target lies there.
//            return search(arr, start, mid-1, target);
//        }
//
//        if(target >= arr[mid] && target <= arr[end]){ // first half not sorted or target not there. check in second half
//            return search(arr, mid+1, end, target);
//        }
//
//        return search(arr, start, mid-1, target);
//        // the target does not lie in the second half, it is in the first hald but that is not sorted.
//
//    }

    static int search(int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }

        int mid = start + (end-start)/2;
        if(target == arr[mid]){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            // the first half of array is sorted.
            if(target <= arr[mid] && target >=arr[start]){
                // the element lies in the first half.
                return search(arr, start, mid-1, target);
            }
            else{
                return search(arr, mid+1, end, target);
            }
        }

        if(target >= arr[mid] && target <= arr[end]){
            return search(arr, mid+1, end, target);
        }

        return search(arr, start, mid-1, target);

    }
}
