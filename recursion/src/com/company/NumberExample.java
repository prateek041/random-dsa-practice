package com.company;

public class NumberExample {

    public static void main(String[] args) {
        // write a function that takes in number and prints it, from 1 to 5.
        printNum(1);
    }

    static void printNum(int num){
        if(num > 5){
            return;
        }
        System.out.println(num);
        num++;
        printNum(num);
    }

}
