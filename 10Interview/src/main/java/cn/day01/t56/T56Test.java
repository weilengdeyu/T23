package cn.day01.t56;

/**
 * @Classname T56Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/12 15:44
 * @Created by Happy-微冷的雨
 */
public class T56Test {
    /**
     * 写一个函数，要求输入一个字符串和一个字符长度，对该字符串进行分隔。
     */
    public static String[] splitChar(String str,int length){
        //01.获取到总共被分割成几部分 "abbccd" 2
        //1.1 获取str的length
        int count = str.length(); //总字符个数
        int partCount=count%length==0?count/length:count/length+1;
        System.out.println(partCount);
        //02.每一部分都是String的方法截取获取的
        //分成了3部分，每一部分都是数组中的一项
        String[] names=new String[partCount];  //null
        for (int i=0;i<partCount;i++){
            //将该部分的截取结果赋值给数组第i项 abbccdd
            if (i==partCount-1){
                names[i] = str.substring(i * length);
            }else {
                names[i] = str.substring(i * length, (i + 1) * length);  //
            }
        }
        return names;
    }
    public static void main(String[] args) {
        String[] names = splitChar("abbccdd", 2);
        for (String item :names){
            System.out.println(item);
        }
    }



    /**person
     *
     * @param str
     * @param chars
     * @return
     */
    public static String[] split(String str, int chars){
        int n = (str.length()+ chars - 1)/chars;
        String[]  strs= new String[n];
        for(int i=0; i<n; i++){
            if(i < n-1){
                strs[i] = str.substring(i*chars , (i+1)*chars);
            }else{
                strs[i] = str.substring(i*chars);
            }
        }
        return strs;
    }
}
