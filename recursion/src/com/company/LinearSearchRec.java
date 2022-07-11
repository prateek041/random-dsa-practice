package com.company;

import java.sql.Array;
import java.util.ArrayList;

public class LinearSearchRec {
    public static void main(String[] args) {
//    int key = 18;
    int [] arr = {3, 2, 1, 4, 4, 18, 9, 18};
//        System.out.println(linearSearchRec(arr, 0, key));
//        findAllIndex(arr, 0, 4);
//        System.out.println(list);
//        System.out.println(findAllTheIndex(arr, 0, 4, new ArrayList<>()));
        System.out.println(findAllTheIndex2(arr, 0, 18));
    }

    static int linearSearchRec(int[] arr, int index, int key){
        if(index > arr.length-1){
            return -1;
        }

        if(arr[index] == key){
            return index;
        }
        return linearSearchRec(arr, index+1, key);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int index, int key){
        if(index > arr.length-1){
            return;
        }

        if(arr[index] == key){
            list.add(index);
        }
        findAllIndex(arr, index+1, key);
    }

    // returning the arraylist now from the arguments.
    static ArrayList<Integer> findAllTheIndex(int[] arr, int index, int key, ArrayList<Integer> list1){
        if(index > arr.length-1){
            return list1;
        }

        if(arr[index] == key){
            list1.add(index);
        }
        return findAllTheIndex(arr, index+1, key, list1);
    }

    // returning the arraylist from the body.
    static ArrayList<Integer> findAllTheIndex2(int[] arr, int index, int key){
        ArrayList<Integer> list = new ArrayList<>();
        if(index > arr.length-1){
            return list;
        }

        if(arr[index] == key){
            list.add(index);
        }
        ArrayList<Integer> fromAbove = findAllTheIndex2(arr, index+1, key);

        list.addAll(fromAbove);

        return list;
    }
}
