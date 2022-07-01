package com.company;

public class infiniteArray {
    public static void main(String[] args) {
        int [] nums = {2, 3, 5, 6, 7, 7, 8, 10, 11, 12, 15, 21, 23, 30, 33, 34, 35, 36, 37, 38};
        int target = 21;
        int indexFound = ans(nums, target);
        System.out.println(indexFound);
    }

    // we set start and end pointers to have a difference of n.
    // we search in that subarray. if the element is found we return the value, else we double the size of the array.
    // we apply binary search to search for the element in the array.


    // my version of checking the range of the search area.
    // my version had a major flaw, it was running the binary search way many times for sub arrays, where the data was
    // definitely not present.
    static int infiniteSearch(int [] nums, int target){
        int start = 0;
        int end = 1;
        int execution = 1;
        // initial check to find the element in the first two indexes.
        int found = binarySearch(nums, target, start, end);
        // we will run the loop until we haven't found the element in the array.
        while (found == -1){
            start = end + 1;
            end += start * 2;
            found = binarySearch(nums, target, start, end);
            execution ++;
        }
        System.out.println(execution);
        return found;
    }

    static int binarySearch(int [] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    // Kunal's way of searching the search area.
    // this way was optimised because it ran the search only once, when the chance of presence of element was the
    // highest.
    static int ans(int[] nums, int target){
        int start = 0;
        int end = 1;

        // condition to fire the search only if the element at the end is greater than our target element.
        while(target > nums[end]){
            start = end + 1;
            end += start*2;

            // another way.
            // int newStart  = end+1;
            // end = end + (end-start+1)*2;
        }
        return binarySearch(nums, target, start, end);
    }
}
