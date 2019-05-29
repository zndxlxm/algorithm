package com.csu.my.algorithm.sort;

/**
 * 选择排序
 * 1、从一次遍历面里面选择出最小的一个值，然后与起始的遍历的那个位置进行交换。
 * 时间复杂度  O(n^2) 排序时间与初始顺序无关，即使初始已经排好了，也要耗费O(N^2)的时间复杂度
 * 空间复杂度 O(1)
 * 
 * @author Administrator
 *
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {1,5,3,9,7,6,5,23,444,111};
        selectSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
//    public static void selectSort(int[] arr) {
//        for(int i = 0; i < arr.length - 1; i++) {
//            int min = i;
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[j] < arr[min] ) {
//                    min = j;
//                }
//            }
//            
//            // 1、此时已经选择出这次最小的数min了
//            // 2、将最小的值与此次遍历的起始位置的值进行交换
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = arr[i];
//        }
//    }
    
//      public static void selectSort(int[] arr) {
//          for(int i = 0; i < arr.length -1; i++) {
//              int min = i;
//              
//              for(int j = i + 1; j < arr.length; j++) {
//                  if(arr[min] > arr[j]) {
//                      min = j;
//                  }
//              }
//              
//              int temp = arr[min];
//              arr[min] = arr[i];
//              arr[i] = temp;
//          }
//      }
//    
//    public static void selectSort(int[] arr) {
//        for(int i = 0; i < arr.length - 1; i++) {
//            // 保存此次遍历最小值的下标
//            int min = i;
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[j] < arr[min]) {
//                    min = j;
//                }   
//            }
//            
//            // 将选择出来的最小的值与遍历的起始位置进行交换
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
//            
//        }
//    }
//    
    
    public static void selectSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for(int j = i + 1;j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
        }
    }
    
    
    
}
