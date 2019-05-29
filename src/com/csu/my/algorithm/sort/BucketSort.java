package com.csu.my.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * 桶排序
 * 算法思想：每个桶代表一个区间范围，里面可以承载一个或者多个元素。
 * 1、桶排序的第一步，就是创建这些桶，确定每个桶的区间范围。
 * 2、我们创建桶的数量默认等于元素的个数。
 * 3、遍历原始数列，将元素对号入座到桶中。
 * 4、每个桶内部的元素分别排序。
 * 5、遍历所有的桶，输出所有元素。
 * @author Administrator
 *
 */
public class BucketSort {
    
    public static void main(String[] args) {
        double[] array = new double[] {4.12,6.421,0.0023,3.0,2.123,8.122,4.12,10.09};
        double[] sortedArray = bucketSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
    
     
     /**
      * 桶排序
      * @param arr
      * @return
      */
     public static double[] bucketSort(double[] array) {
        // 从数组中获取到最大值与最小值 
        double max =  array[0];
        double min =  array[0];
         
        for(int i = 0 ; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }else if(array[i] > max){
                max = array[i];
            }
        }
        
        // 计算最大值与最小值之间的差值
        double d = max - min;
        
        // 初始化桶的大小
        int bucketNum = array.length;
        
        // 初始化桶
        ArrayList<LinkedList<Double>> bucketList = new ArrayList<LinkedList<Double>>(bucketNum);
        
        for(int i = 0; i < bucketNum; i++) {
            bucketList.add(new LinkedList<Double>());
        }
        
        // 遍历原始数组，将数组中的数据放到桶中
        for(int i = 0; i < array.length; i++) {
            // 将数据打到对应的桶里面  2 4 0 2 1 5 2 7 
            int num = (int)((array[i] - min) * (bucketNum-1) / d);
            //System.out.print(num + " ");
            bucketList.get(num).add(array[i]);
        }
        
        // 对每个桶内部进行排序
        for(int i = 0; i < bucketList.size(); i++) {
            Collections.sort(bucketList.get(i));
        }
        
        // 输出全部的数组
        double[] sortedArray = new double[array.length];
        int index = 0;
        for(LinkedList<Double> list : bucketList) {
            for(Double element : list) {
                sortedArray[index++] = element;
            }
        }
        
        return  sortedArray;   
     }

}
