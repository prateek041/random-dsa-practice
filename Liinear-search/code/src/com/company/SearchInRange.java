package com.company;

// when we have to search for an element is a given range.
public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {20, 22, 19, 89, 123, 45, -3, -11, -1};
        int target = 45;
        boolean ans = search1(nums, target, 2, 5);
    }
    static boolean search1(int [] nums, int target, int start, int end) {
        if (nums.length != 0){
            for (int index = start ; index <= end ; index++) {
                if (nums[index] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
