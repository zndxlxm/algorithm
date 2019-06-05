package com.csu.my.algorithm.query;

/**
 * 二分查找
 * 算法思想：元素必须是有序的，如果是无序的则必须先进行排序操作，也称折半查找，
 *          属于有序查找算法，用给定的值K与中间节点关键字进行比较，中间节点把
 *          线性表分成了两部分，若相等，则查找成功。
 *          若不相等，再根据K与该中间节点的比较的结果，确定下一步查找哪个子表，
 *          这样递归进行，直到查找到或查找结束发现表中没有这样的节点。
 * 时间复杂度：O(log2n)
 * @author Administrator
 *
 */
public class BinaryQuery {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = getIndex(arr, 2);
        System.out.println(index);
    }
    
    public static int getIndex(int[] arr, int num) {
        // 定义变量，表示查找数据范围的最左侧，先从0索引开始
        int left = 0;
        // 定义变量，表示查找数组范围的最右侧，先从最大索引开始
        int right = arr.length - 1;
        // 定义变量，表示查找范围的中间值
        int mid = 0;
        
        while(left <= right) {
            // 中间索引 = (左侧+右侧)/2
            // 为了提高效率，可以采用位运算代替除运算
            mid = (left + right) >> 1;
            if(arr[mid] > num) {
                right = mid - 1;
            }else if(arr[mid] < num) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        
        return mid;
        
    }
    
}
