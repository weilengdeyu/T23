package cn.day01.t93;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname T93Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/16 12:10
 * @Created by Happy-微冷的雨
 */
public class T93Test {
    public static void main(String[] args) throws IOException {
        //序列化可以保存对象的全景图
        //IO XML节点  保存数据  ，无法保存方法，打散对象的属性
        List<UserInfo> list=new ArrayList<UserInfo>();
        UserInfo u1=new UserInfo(22,"张靓颖");
        UserInfo u2=new UserInfo(24,"李小龙");
        list.add(u1);
        list.add(u2);

        OutputStream os=new FileOutputStream("save.bin"); //和硬盘上的一个路径绑定
        ObjectOutputStream oos=new ObjectOutputStream(os); //封装低级流
        oos.writeObject(list);
        System.out.println("serialable success");
        oos.close();
        os.close();


    }
}
