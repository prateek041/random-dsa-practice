package com.company;

public class sumOfDigits {
    public static void main(String[] args) {
        int number = 1342;
        System.out.println(sumDigit(number));
    }

    static int sumDigit(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sumDigit(n/10);
    }
}
