package com.company;

public class Smallestletter {
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }

    // check for text wrapping. wrap around simply means, if there is no element in the array, greater than the target
    // return the 0th element.

    static char nextGreatestLetter(char [] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target > letters[mid]) {
                start = mid+1;
            } else if (target < letters[mid]){

            }
        }
        return letters[start % letters.length];
    }

}
