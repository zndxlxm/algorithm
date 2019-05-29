package com.csu.my.algorithm.sort;

/**
 * 冒泡排序
 * 1、时间复杂度  最好的情况   最坏的情况
 *               O（N）         O(N^2)
 * 2、空间复杂度   O(1)
 * @author Administrator
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        
        int arr[] = {2,5,6,7,9,1,3,9,81,711,8,72};
        bubbleSort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
        
    }
    
//    public static void bubbleSort(int[] arr) {
//        // 是否需要继续交换
//        boolean isNeedExchange = true;
//        
//        for(int i = 0; i < arr.length - 1 && isNeedExchange == true; i++) {
//            isNeedExchange = false;
//            for(int j = 0; j < arr.length - i - 1; j++) {
//                 // 如果前面的数比后面的大
//                 if(arr[j]  > arr[j + 1]) {
//                    
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    
//                    isNeedExchange = true;
//                 } 
//            }
//        }
//    }
    
//    public static void bubbleSort(int[] arr) {
//        boolean isNeedExchange = true;
//        
//        for(int i = 0;i < arr.length - 1 && isNeedExchange == true; i++) {
//            
//            isNeedExchange = false;
//            
//            for(int j = 0; j < arr.length - 1 -i; j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                    
//                    isNeedExchange = true;
//                }
//            }
//            
//        }
//    }
//    
//    public static void bubbleSort(int[] arr) {
//        boolean isNessaryExchange = true;
//        
//        for(int i = 0; i < arr.length - 1 && isNessaryExchange == true; i++) {
//            isNessaryExchange = false;
//            
//            for(int j = 0; j < arr.length - i - 1; j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                    
//                    isNessaryExchange = true;
//                }
//               
//            }
//        }
//    }
    
//    public static void bubbleSort(int[] arr) {
//        
//        boolean isNeedExchange = true;
//        
//        for(int i = 0; i < arr.length - 1 && isNeedExchange == true; i++) {
//            
//            isNeedExchange = false;
//            
//            for(int j = 0; j < arr.length - 1 - i; j++) {
//                if(arr[j] > arr[j + 1]) {
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                    
//                    isNeedExchange = true;
//                }
//            }
//            
//        }
//    }
    
//    public static void bubbleSort(int[] arr) {
//        
//        boolean isNeedExchange = true;
//        for(int i = 0;i < arr.length - 1 && isNeedExchange == true; i++) {
//            isNeedExchange = false;
//            
//            for(int j = 0; j < arr.length - i - 1; j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j + 1] = temp;
//                    isNeedExchange = true;
//                }
//            }
//        }
//    }
    
    public static void bubbleSort(int[] arr) {
        boolean isNeedExchange = true;
        for(int i=0; i < arr.length-1 && isNeedExchange == true; i++) {
            isNeedExchange = false;
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isNeedExchange = true;
                }
            }
        }
        
    }
    
}
