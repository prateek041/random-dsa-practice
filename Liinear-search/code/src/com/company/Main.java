package com.company;

public class Main {

    public static void main(String[] args) {
    int[] nums = {20, 22, 19, 89, 123, 45, -3, -11, -1};
    int target = -1;
//    int ans1 = linearSearch(nums, target);
    int ans2 = linearSearch2(nums, target);
//    boolean ans3 = linearSearch3(nums, target);
//    System.out.println(ans1);
    System.out.println(ans2);
//    System.out.println(ans3);
    }
    // Search the entire array: return the index if the value found else return -1.
    static int linearSearch(int [] arr, int target) {
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                // compare element with every index.
                if (arr[i] == target) {
                    return i;
                }
            }

            // the above two conditions check if the list is empty, and if not empty, where is the element is present.
        }
        return -1;
    }

    // Search every element of the array, and the return the target, if found.
    static int linearSearch2(int[] arr, int target) {
        if (arr.length != 0) {
            for (int element : arr) {
                if (element == target) {
                    return element;
                }
            }
        }
        return -1;
    }

    // Search the target and return true or false.
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length != 0) {
            for (int element : arr ) {
                if (element == target) {
                    return true;
                }
            }
        }
        return false;
    }

}
