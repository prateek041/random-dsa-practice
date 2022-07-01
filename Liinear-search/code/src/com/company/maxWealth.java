package com.company;

public class maxWealth {
    public static void main(String[] args) {
        int [][] account = {{1, 2 , 3}, {1, 2, 3, 44}};
        int [] wealthArray = wealthChecker(account);
        int maxWealth = wealthCompare(wealthArray);
        System.out.println(maxWealth);
    }

    // function to check the total amount every account holder has.
    static int[] wealthChecker (int [][] account){
        int wealth = 0;
        for (int accountHolder = 0 ; accountHolder < account.length ; accountHolder++){
            for (int bankAmount = 0 ; bankAmount < account[accountHolder].length ; bankAmount++) {
                wealth += bankAmount;
            }
            new int [] wealthArray[accountHolder] = {accountHolder, wealth}
        }
        return wealthArray;
    }

    // function to check who has the greatest wealth.
    static int wealthCompare(int [] wealthArray){
        int max = wealthArray[0];
        for (int amount : wealthArray){
            if (amount > max){
                max = amount;
            }
        }
        return max;
    }
}
