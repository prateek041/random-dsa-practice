package com.company;

public class countZero {
    public static void main(String[] args) {
        int count = 0;
        System.out.println(zeroCount(20103090, count));
    }

//    static int count = 0;
//    static int zeroCount(int n){
//        if(n%10 == n){
//            return 0;
//        }
//        if(n%10 == 0){
//            count++;
//        }
//        zeroCount(n/10);
//        return count;
//    }

    static int zeroCount(int n, int count){
        if(n%10 == n){
            return count;
        }
        if(n%10 == 0){
            count++;
        }
        return zeroCount(n/10, count);
    }
}
