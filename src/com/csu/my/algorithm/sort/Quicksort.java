package com.csu.my.algorithm.sort;

/**
 * 快速排序
 * 【算法思想】
 * 每次排序的时候设置一个基准点，将小于等于基准点的数据全部放到左边，将大于等于基准点的数据全部放到右边。
 * 这样在每次交换的时候就不会像冒泡排序一样只是相邻的数之间的交换，交换的距离就大的多了。          
 * @author Administrator
 *
 */
public class Quicksort {
    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        
        quickSort(arr, 0, arr.length - 1);
        SortUtils.printf(arr);
    }   
    
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int index = getIndex(arr, low, high);
            quickSort(arr, 0 , index-1);
            quickSort(arr, index + 1, high);
        }
    } 
    
    private static int getIndex(int[] arr,int low,int high) {
        // 基准数据
        int tmp = arr[low];
        
        while(low < high) {
            // 当队尾元素大于基准数据时，向前移动high指针
            while(low < high && arr[high] >= tmp) {
                high--;
            }
            
           // 如果队尾元素小于tmp了，需要将其赋值给low
            arr[low] = arr[high];
            
            
            while(low < high && arr[low] <= tmp) {
                low++;
            }
            
            // 当队首的值大于tmp了，需要将其赋值给high
            arr[high] = arr[low];
            
        }
        
        // 当挑出循环low等于high时
        arr[low] = tmp;
        
        // 返回tmp的正确位置
        return low;
    }
    
}
