package com.csu.my.algorithm.sort;

public class SortUtils {
    
    public static void printf(int[] arr) {
        System.out.print("{");
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.print(arr[i]);    
            }else {
                System.out.print(arr[i] + ",");    
            }
        }
        System.out.println("}");
    }

}
