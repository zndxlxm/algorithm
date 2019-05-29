package com.csu.my.algorithm.sort;

/**
 * 希尔排序
 * 1、选择一个增量gap=length/2。
 * 2、缩小增量以gap = gap/2的方式。
 * 时间复杂度：O(^3/2) 空间复杂度O(1)
 * @author Administrator
 *
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {1,5,3,9,7,6,5,23,1,111};
        shellSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    /**
     * 希尔排序
     * @param arr
     */
    public static void shellSort(int[] arr) {
        for(int gap = arr.length / 2; gap > 0; gap/=2) {
            for(int i = gap;i < arr.length; i++) {
                // 抽取出需要进行合并的数据
                int j = i;
                int temp = arr[i];
                
                // 按照步长来跳跃比较
                while(j-gap>0 && temp<arr[j-gap]) {
                    arr[j] = arr[j-gap];
                    j = j - gap;
                }
                
                // 将抽取出来的牌插入到需要插入的位置
                arr[j] = temp;
            }
        }
    }
    
}
