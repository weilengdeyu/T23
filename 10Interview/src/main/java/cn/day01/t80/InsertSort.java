package cn.day01.t80;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Classname InsertSort
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/13 14:06
 * @Created by Happy-微冷的雨
 */
public class InsertSort {

    ArrayList<Integer> list;

    /**
     *
     * @param num
     * @param mod
     */
    public InsertSort(int num,int mod) {
        list = new ArrayList<Integer>(num);
        Random rand = new Random();
        System.out.println("The ArrayList Sort Before:");
       /* for (int i=0;i<num ;i++ ){
            list.add(new Integer(Math.abs(rand.nextInt()) % mod + 1));
            System.out.println("list["+i+"]="+list.get(i));
        }*/
       list.add(7);
       list.add(81);
       list.add(9);
    }

    public void SortIt(){
        Integer tempInt;
        int MaxSize=1;
        for(int i=1;i<list.size();i++){
            tempInt = list.remove(i); //7  81  9
            System.out.println(tempInt+"==============");
            if(tempInt.intValue() >= (list.get(MaxSize-1)).intValue()){
                list.add(MaxSize,tempInt);
                MaxSize++;
               // System.out.println(list.toString());
            }else{
                for (int j=0;j<MaxSize ;j++ ){
                    System.out.println("===========2222====================");
                    if ((list.get(j)).intValue() >=tempInt.intValue()){
                        list.add(j,tempInt);
                        MaxSize++;
                        System.out.println("===============================");
                        System.out.println(list.toString());
                        break;
                    }
                }
            }
        }

        System.out.println("排序后:");
        for(int i=0;i<list.size();i++){
            System.out.println("list["+i+"]="+list.get(i));
        }

    }
}
