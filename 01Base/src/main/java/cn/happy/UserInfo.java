package cn.happy;

/**
 * @Classname UserInfo
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/1 9:33
 * @Created by Happy-微冷的雨
 */
public class UserInfo {

    private Integer age;
    private String name;

    public UserInfo() {
    }

    public UserInfo(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    //气氛不对啊
    //不可能：：：：：：
    //如果一个类没有重写  toString() 我们通过代码
   // UserInfo u1=new UserInfo(20，"张三");
    //System.out.print(u1); 内存地址 cn.happy.UserInfo@E141
    @Override
    public String toString() {
        return "UserInfo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
