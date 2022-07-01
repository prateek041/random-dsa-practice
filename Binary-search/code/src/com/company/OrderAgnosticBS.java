package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] ascendingArray = {-18, -12, -4, 0 ,2 , 3, 4, 15, 16, 18, 22, 45, 89};
        int [] descendingArray = {89, 45, 22, 15, 16, 4, 3, 2, 0, -12, -18, -22};
        int target = 0;
        System.out.println(orderAgnosticBS(ascendingArray, target));
        System.out.println(orderAgnosticBS(descendingArray, target));
    }

    // binary search function.
    static int orderAgnosticBS(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // checking if the array is sorted in ascending or descending order.
        boolean isDesc = arr[start] > arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }

            if (isDesc){
                if (target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
