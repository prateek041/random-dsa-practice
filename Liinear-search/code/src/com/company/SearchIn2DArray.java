package com.company;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        // here we did not use new int [][] while creating nums array, it's because we are assigning it to the type
        // array, so it already knows, and therefore we don't need to tell it specifically.
        int[][] nums = {{22, 39, 82}, {-21, 69, 83}, {45, 83}, {-148, 224, -1080}};
        int target = 39;
        int [] ans = search(nums, target);
        int max = searchMax(nums);
        System.out.println(Arrays.toString(ans));
        System.out.println("The max value in the array is "+max);
    }

    // for searching in the 2D array.
    static int[] search(int[][] arr, int target) {
        if (arr.length != 0) {
            for (int row = 0; row < arr.length; row++) {
                for (int column = 0; column < arr[row].length; column++) {
                    if (arr[row][column] == target) {
                        // here we are using new int[] because now, we are creating array object and for computer to
                        // know that it's an array object we need to use new int[]
                        return new int[]{row, column};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int searchMax(int [][] nums){
        if (nums.length != 0){
            int max = nums[0][0];
            for (int[] num : nums) {
                for (int column : num) {
                    if (column > max) {
                        max = column;
                    }
                }
            }
            return max;
        }
        return -1;
    }
}
