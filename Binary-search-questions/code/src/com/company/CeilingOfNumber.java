package com.company;

public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 9, 14, 16, 18};
        int target = 19;
        System.out.println(ceilOfNum(nums, target));
    }

    // this function is used to check if the array is sorted in ascending or descending order.
    // return 1 if ascending, -1 if descending and 0 if same element all over the array.
    static int isAsc(int[] nums) {
        if (nums[0] > nums[nums.length - 1]) {
            return -1;
        } else if (nums[0] < nums[nums.length - 1]) {
            return 1;
        }
        return 0;
    }

    static int CeilingOfnumber(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length > 0) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                // if condition to check if start == end.
                if (start != end) {
                    // if the array is arranged in ascending order.
                    if (isAsc(nums) == 1) {
                        if (target > nums[mid]) {
                            start = mid + 1;
                        } else if (target < nums[mid]) {
                            end = mid - 1;
                        } else {
                            return mid;
                        }
                    }

                    // if the array is arranged in descending order.
                    else if (isAsc(nums) == -1) {
                        if (target > nums[mid]) {
                            end = mid - 1;
                        } else if (target < nums[mid]) {
                            start = mid + 1;
                        } else {
                            return mid;
                        }
                    }

                    // if the array only contains same element.
                    //                else{
                    //                    return nums[0];
                    //                }
                } else {
                    return nums[mid];
                }
            }
        }
        return nums[0];
    }


// the overall condition for this problem is that, if we find the element in the array, we return it, and if we don't
// find the array, we simply return the number just greater than our target element.

    static int ceilOfNum(int[] nums, int target) {
        if (target > nums[nums.length-1]){
            return nums[nums.length-1];
        }
        int start = 0;
        int end = nums.length - 1;
        // this loop will break only in two conditions,
        // 1: if the element is not found until the end.
        // 2: if the element is found and the value is returned.
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return nums[mid];
            }
        }

        // either start and end finally point to the number in the end, or start points the number, just greater than
        // the target and end points the number just smaller than the target element.
        System.out.println("the floor of the number is, "+nums[end]);
        return nums[start];
    }
}
    // floor is the greatest number, that is smaller or equal to the smallest number.
