package com.company;

public class nTo1 {
    public static void main(String[] args) {
        int startNum = 1;
        printNum(5);
    }

//    static void printNum(int n, int num){
//        if (num == n){
//            System.out.println(num);
//            return;
//        }
//        System.out.println(num);
//        printNum(n, num+1);
//        System.out.println("hehe line check");
//    }

    static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
        System.out.println(n);
    }
}
