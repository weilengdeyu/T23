package cn.happy.day01;

import java.sql.*;
import java.util.Scanner;

/**
 * @Classname SqlInjectionTest
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/4 11:16
 * @Created by Happy-微冷的雨
 */
public class SqlInjectionTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner input=new Scanner(System.in);
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/t23";
        String username="root";
        String password="root";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username, password);
        // PreparedStatement ps;//防止
        Statement stat=con.createStatement();
        System.out.println("====这里是登录====");
        System.out.println("请输入用户名");
        String name=input.nextLine();
        System.out.println("请输入密码");
        String pwd=input.nextLine();
        String sql="select count(1) as mycount from userinfo where loginname='"+name+"' and loginpwd='"+pwd +"'";
        System.out.println(sql);
        ResultSet rs = stat.executeQuery(sql);
        if (rs.next()){
            int count = rs.getInt("mycount");
            if (count>0){
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }
        }
        rs.close();
        con.close();
    }
}
