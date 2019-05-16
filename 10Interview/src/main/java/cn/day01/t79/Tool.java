package cn.day01.t79;

import java.util.List;

/**
 * @Classname Tool
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/14 11:57
 * @Created by Happy-微冷的雨
 */
public class Tool {
    public static void bubbleSort(List<Integer> list){
        for (int i=0;i<list.size()-1;i++){
            for (int j=0;j<list.size()-1-i;j++){
                //比较
                if (list.get(j)>list.get(j+1)){ //第j项大于第j+1互换
                    //引入第三方变量
                    int temp=list.get(j) ;
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
    }
}
//面试题
