package com.csu.my.algorithm.sort;
/**
 * 插入排序：就像平时打牌一样，第一张默认是有序的，从第二张开始，抽取出来，和前面的牌进行比较，如果前面的牌>后面的牌，就将前面的牌向后移动，
 *           一次进行，直到前面的牌小于等于后面的牌时，将抽取出来的牌插到当前位置。
 * 时间复杂度：O(n^2)
 * 空间复杂度: O(1) 
 * @author Administrator
 *
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,9,88,0,889,11};
        insertSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
    /**
     * 插入排序
     * @param arr
     */
    public static void insertSort(int[] arr) {
        
        // 第0张牌，默认是有序的，所以从第一张牌开始
        for(int i = 1; i < arr.length; i++) {
            
            // 将牌抽取出来保存到一个临时变量里面
            int extract = arr[i];
            int flag = i;
            
            // 将抽取出来的牌，与前面的牌进行比较
            for(int j = i -1; j >= 0; j--) {
                
                // 如果当前的牌比抽取出来的牌大，那么就将这张牌向后移动
                // 同时将抽取出来的牌插入的位置标记设置为j
                if(arr[j] > extract) {
                    arr[j + 1] = arr[j];
                    flag = j;
                // 如果当前的牌比抽取出来的牌小
                // 那么将抽取出来的牌插入到当前的后面
                // 即flag = j + 1
                }else {
                    flag = j + 1;
                    break;
                }
                
                arr[flag] = extract;
            }
            
        }
        
    }
    
//    public static void insertSort(int[] arr) {
//        /**
//         * 第0张牌默认是有序的
//         */
//        for(int i = 1; i < arr.length; i++) {
//            int j = i;
//            int tmp = arr[j];
//            
//            // 如果前面的牌比后面的大，就将前面的牌向后移动
//            while(j > 0 && arr[j-1] > tmp) {
//                arr[j] = arr[j - 1];
//                j--;
//            }
//            
//            // 将拿出来的牌，插入到当前的j位置
//            if(j != i) {
//                arr[j] = tmp;
//            }
//            
//            
//        }
//    }

//      public static void insertSort(int[] arr) {
//          // 第0张牌默认是有序了，所以从第一张牌开始
//          for(int i = 1; i < arr.length; i++) {
//              // 首先出去出第一张牌
//              int extract = arr[i];
//              
//              // 标记插牌的位置
//              int flag = i;
//              
//              for(int j = i-1; j >= 0; j--) {
//                  // 如果抽取出来的牌比前面的牌小，就将前面的牌后移
//                  if(extract < arr[j]) {
//                      arr[j+1] = arr[j];
//                      // arr[j] = extract;
//                      flag = j;
//                  }else {
//                      flag = j + 1;
//                      // 如果抽取出来的牌比前面的牌大，就将取出来的牌插到前面牌的后面
//                      break;
//                  }
//              }
//              
//              arr[flag] = extract;              
//          }
//          
//      }
    
}
