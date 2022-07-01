package com.company;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {20, 22, -290, 19, 89, 123, 45, -3, -11, -1, -69};
        System.out.println(min(nums));
    }

    static int min(int[] nums){
        if (nums.length != 0) {
            int minElement = nums[0];
            for (int element : nums) {
                if (element < minElement) {
                    minElement = element;
                }
            }
            return minElement;
        }
        else return -1;
    }
}
