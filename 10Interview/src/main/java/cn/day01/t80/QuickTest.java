package cn.day01.t80;

import java.util.Arrays;

/**
 * @Classname QuickTest
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/14 17:26
 * @Created by Happy-微冷的雨
 */
public class QuickTest {
    public static void main(String[] args) {
        int[] array={5,9,7,4/*,5,7,6,1,9,9,7,4*/};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
   public static void sort(int[] array){
        if(array.length>0){
            //严谨性判断
            quickSort(array,0,array.length-1);
        }
    }

    public static void quickSort(int[] arr,int _left,int _right){
        int left = _left;  //数组的最低位
        int right = _right;  //数组的最高位
        int temp = 0;  //参照值 （）
        if(left <= right){   //待排序的元素至少有两个的情况
            temp = arr[left];  //待排序的第一个元素作为基准元素
            while(left != right){   //从左右两边交替扫描，直到left = right
                while(right > left && arr[right] >= temp) {
                    right--;        //从右往左扫描，找到第一个比基准元素小的元素
                }
                arr[left] = arr[right];  //找到这种元素arr[right]后与arr[left]交换

                //right 2
                while(left < right && arr[left] <= temp)
                    left ++;         //从左往右扫描，找到第一个比基准元素大的元素
                arr[right] = arr[left];  //找到这种元素arr[left]后，与arr[right]交换
            }
            System.out.println(right+"==============right=======");
            System.out.println(left+"===============left========");
            arr[right] = temp;    //基准元素归位
            quickSort(arr,_left,left-1);  //对基准元素左边的元素进行递归排序
            quickSort(arr, right+1,_right);  //对基准元素右边的进行递归排序
        }
    }
}


