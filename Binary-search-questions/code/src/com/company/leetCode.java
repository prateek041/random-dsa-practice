package com.company;

public class leetCode {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums){
        // first take out the number in the array.
        for (int num = 0; num < nums.length ; num++){
            // taking out every element except the element at its own index.
            for (int num2 = 0; num2 < nums.length ; num2++){
                // condition for not comparing the number if the index is same.
                if (num != num2){
                    if(nums[num2] == nums[num]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
