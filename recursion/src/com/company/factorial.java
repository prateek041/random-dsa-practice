package com.company;

public class factorial {
    public static void main(String[] args) {
        System.out.println(facto(5));
    }

    static int facto(int n){
        if (n==1 ){
            return 1;
        }
        return n*(facto(n-1));
    }
}
