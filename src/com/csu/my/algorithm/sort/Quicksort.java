package com.csu.my.algorithm.sort;

/**
 * 快速排序
 * 算法思想:
 * 每次排序的时候设置一个基准点，将小于等于基准点的数据全部放到左边，将大于等于基准点的数据全部放到右边。
 * 这样在每次交换的时候就不会像冒泡排序一样只是相邻的数之间的交换，交换的距离就大的多了。  
 * 1、从数组中寻找你一个标准点，接下来将数组中小于基准点的数据移动到标准点的左边，大于基准点的数据移动到标准掉的右边。
 * 2、设置两个指针i与j，j从右边开始移动，j从右边开始找到小于基准值的数据然后在该值处停下来，i从左边开始找到大于基准值的数据，然后在
 *    该值处停下来。
 * 3、交换i指定的大于基准值的值与j指定的小于基准值的值。
 * 4、按照如上规则继续移动j与i，知道j与i重合，这个位置应该就是基准点的位置k。
 * 5、将k位置的值与基准点的值进行交换，即完成了第一轮的排序。
 * 6、如此往复，递归完成整个数组的排序。
 * 复杂度：
 *         
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
        // 递归完毕的条件
        if(low < high) {
            // 获取基准数据的位置
            int index = getIndex(arr, 0 , high);
            // 对基准数左边的
            quickSort(arr, 0 , index-1);
            quickSort(arr, index+1 , high);
        }
    }
    
    public static int getIndex(int[] arr, int low,int high) {
        // 假定基准数就是第一个数
        int temp  = arr[low];
        int flag  = low;
        
        while(low < high) {
            // 从右边开始遍历，是为了最终low=high的位置的值是小于基准数的
            // 如果右边的数据大于基准数，则将high继续向左移动
            if(arr[high] > temp) {
                high--;
            }
            
            if(arr[low] < temp) {
                low++;
            }
            
            // 交换arr[low]与arr[high]里面的值
            int exchange = arr[low];
            arr[low] = arr[high];
            arr[high] = exchange;
        }
        
        // 跳循环的时候，交换基准数与当前基准数位置的值
        arr[flag] = arr[low];
        arr[low] = temp;
        
        return low;
        
    }
    
//    public static void quickSort(int[] arr, int low, int high) {
//        if(low < high) {
//            int index = getIndex(arr, low, high);
//            quickSort(arr, 0 , index-1);
//            quickSort(arr, index + 1, high);
//        }
//    } 
//    
//    private static int getIndex(int[] arr,int low,int high) {
//        // 基准数据
//        int tmp = arr[low];
//        
//        while(low < high) {
//            // 当队尾元素大于基准数据时，向前移动high指针
//            while(low < high && arr[high] >= tmp) {
//                high--;
//            }
//            
//           // 如果队尾元素小于tmp了，需要将其赋值给low
//            arr[low] = arr[high];
//            
//            
//            while(low < high && arr[low] <= tmp) {
//                low++;
//            }
//            
//            // 当队首的值大于tmp了，需要将其赋值给high
//            arr[high] = arr[low];
//            
//        }
//        
//        // 当挑出循环low等于high时
//        arr[low] = tmp;
//        
//        // 返回tmp的正确位置
//        return low;
//    }
    
}
