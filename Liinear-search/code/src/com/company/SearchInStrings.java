package com.company;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Prateek singh";
        char target = 'm';
//        boolean ans = search1(name, target);
        boolean ans2 = search2(name , target);
        System.out.println(ans2);
//        System.out.println(ans);
    }
    // using iterations and index.
    static boolean search1(String str, char target) {
        if (str.length() != 0){
            for (int index = 0 ; index < str.length() ; index++) {
                if (str.charAt(index) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    // using for each.
    static boolean search2(String str, char target) {
        if (str.length() != 0) {
            // since for each loop needs an iterable, so we convert our string to a character array.
            for (char ch : str.toCharArray()) {
                if (ch == target) {
                    return true;
                }
            }
        }
            return false;
    }
}
