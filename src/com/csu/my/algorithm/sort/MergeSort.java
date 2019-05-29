package com.csu.my.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 1、采用分而治之的思想，递归完成
 * @author Administrator
 *
 */
public class MergeSort {
    
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,9,88,0,889,11};
        int[] result = mergeSort(arr);
        SortUtils.printf(result);
        
    }
    
    public static int[] mergeSort(int[] sourceArray) {
        // 将原有数组拷贝一份
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        
        //SortUtils.printf(arr);
        
        // 如果数据中只有一条数据，则直接返回
        if(arr.length < 2) {
            return arr;
        }
        
        // 获取中间
        int middle = (int)Math.floor(arr.length/2); 
        
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);
        
        return merge(mergeSort(left), mergeSort(right));
    }
    
    /**
     * 合并两个数组
     * @param left
     * @param right
     */
    public static int[] merge(int[] left, int[] right) {
        // 给合并后的数组开辟空间
        int[] result = new int[left.length+right.length];
        // 设置起始设置值的位置
        int i = 0;
        
        // 当要合并的两个数组都有值的情况下
        while(left.length > 0 && right.length > 0) {
             // 如果左边数组的第一个值<=右边数组的第一个值
             if(left[0] <= right[0]) {
                 // 将左边数据的第一个值设置到合并的结果中
                 result[i++] = left[0];
                 // 将已经合并的值从left数组中剔除
                 left = Arrays.copyOfRange(left, 1, left.length);
             }else {
                 // 将右边数组的第一个值设置到合并的结果中
                 result[i++] = right[0];
                 right = Arrays.copyOfRange(right, 1, right.length);
             }
        }
        
        // 当right数组已经合并完，只有left数组还有剩余值的情况下，直接将left数组里面的值，直接拷贝到result中即可。
        while(left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        
      // 当left数组已经合并完，只有right数组还有剩余值的情况下，直接将left数组里面的值，直接拷贝到result中即可。
        while(right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        
        
        return result;
        
    }

}
