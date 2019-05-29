package com.csu.my.algorithm.sort;

import java.util.Arrays;

/**
 * 基数排序
 * 算法思想：基数排序是通过分配和收集的方式来进行排序，其原理是将整数切割成不同的数字。
 *           然后按每个位分别进行比较。基数排序会使用到桶(bucket),顾明思议，通过将要
 *           比较的位（个，十，百），将要排序的元素放到0-9个桶中，借以达到排序的作用，
 *           在某些时候，基数排序法的效率高于其它的比较性的排序法。
 * 算法步骤: 1、将所有带比较的值（正整数）统一为同样的数据长度，数据较短的数据前面补零。
 *           2、从最低位开始，一次进行一次排序。
 *           3、从最低位排序一直到最高位排序结束，数列就变成了一个有序的序列。
 * @author Administrator
 *
 */
public class RadixSort {
    
    public static void main(String[] args) {
        
        int arr[] = {2,5,6,7,9,1,3,9,81,711,8,72};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    
    /**
     * 基数排序
     * @param array
     */
    public static int[] radixSort(int[] arrays) {
        // 获取到该数组中最大的值
        int max = getMaxValue(arrays);
        
        // 遍历的次数由最大的那个数进行确定
        for(int i = 1; max/i > 0; i = i * 10) {
            
            // 初始化桶的大小   纵坐标是arrays.length 横坐标是10
            int[][] buckets = new int[arrays.length][10];
            
            // 获取每一个数字，分配到不同的桶里面
            for(int j = 0; j < arrays.length; j++) {
                
                // 计算桶的落地位置
                int num = (arrays[j] / i) % 10;
                buckets[j][num] = arrays[j];
            }
            
           // 回收桶里面的数据
           int k = 0; 
            
           for(int j = 0; j < 10; j++) {
               for(int l = 0; l < arrays.length; l++) {
                   if(buckets[l][j] > 0) {
                       arrays[k++] = buckets[l][j];
                   }
               }               
           }
        }
        
        return arrays;
    }
    
    private static int getMaxValue(int[] array) {
        
        // 获取数组中最大的值
        if(array.length > 0) {
            int max = array[0];
            
            for(int i = 0; i < array.length; i++) {
                if(array[i] > max) {
                    max = array[i];
                }
            }
            
            return max;
        }
        
        return 0;
    }
}
