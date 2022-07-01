package com.company;

public class EvanDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 3};
        int evenCount = numCheck(nums);
        System.out.println(evenCount);
    }

    // function for finding the number of digits in the number.
    static boolean numDigit(int num) {
        int count = 0;
        int numCopy = num;
        while (numCopy != 0) {
            count++;
            numCopy /= 10;
        }
        return evenChecker(count);
    }

    // function for checking if the number is even or not.
    static boolean evenChecker(int num) {
        return num % 2 == 0;
    }

    // function for accessing all the values of the array.
    static int numCheck(int[] nums) {
        int evenCount = 0;
        for (int number : nums) {
            // using string manipulation.
            boolean evenCheck = evenCheckString(number);
            // using integer manipulation.
//          boolean evenCheck = evenChecker(number);
            if (evenCheck) {
                evenCount++;
            }
        }
        return evenCount;
    }


// the above methods were using integer manipulation for solving the problem, now we will use string.


    static boolean evenCheckString(int num){
        String number = num + "";
        return number.length()%2==0;
    }

}
