package com.csu.my.algorithm.sort;

/**
 * 计数排序：使用非基于比较的排序算法，其空间复杂度与实时间复杂度都为O(n+k)，计数排序的核心是将输入的数据转化为
 * 键存储的在额外开辟的空间，作为一种线性时间复杂度的排序，计数排序要求输入的数据必须是确定范围的整数(0到k)。
 * 
 * @author Administrator
 *
 */
public class CountSort {

    public static void main(String[] args) {

        int arr[] = { 2, 5, 6, 7, 9, 1, 3, 9, 81, 711, 8, 72 };
        int[] sortedArray = countSort(arr);
        SortUtils.printf(sortedArray);

    }

    public static int[] countSort(int arr[]) {
        // 1、计算数组的最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 2、根据最大值去确定数组的长度
        int[] countArray = new int[max + 1];

        // 3、遍历数列，填充统计数组
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }

        // 4、遍历数组，输出结果
        int index = 0;
        int[] sortedArray = new int[arr.length];

        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[index++] = i;
            }
        }
        
        return sortedArray;

    }
}
