package com.csu.my.algorithm.query;

/**
 * 顺序查找 
 * 算法思想：顺序查找也称为线性查找，属于无序查找算法，从数据结构线性表的一端开始，顺序扫描。
 * 依次将扫描到的节点关键字与给定值进行比较，若相等则返回成功。
 * 时间复杂度：O(N) 
 * 
 * @author Administrator
 *
 */
public class SequenceQuery {

    public static void main(String[] args) {
        int[] a = {1,5,7,9,2,3};
        int index = SequenceSearch(a,3);
        System.out.println(index);
    }
    
    public static int SequenceSearch(int[] a,int value) {
        for(int i=0; i<a.length; i++) {
            if(a[i]==value) {
                return i;
            }
        }
        
        return-1;
    }
}

