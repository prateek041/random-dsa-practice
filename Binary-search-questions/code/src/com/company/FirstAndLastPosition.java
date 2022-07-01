package com.company;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int [] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target){
        int [] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // Function to search for the occurrences of the numbers.
    static int search(int [] nums, int target, boolean findStartingIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if (target < nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else{
                // this might be the ans we are looking for.
                ans = mid;
                if (findStartingIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
