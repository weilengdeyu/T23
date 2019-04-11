package cn.spring.day04xmldi;

/**
 * @Classname UserInfo
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/11 10:58
 * @Created by Happy-微冷的雨
 */
public class UserInfo {
    private Integer uid;
    private String uname;
    //域属性
    private Address address;


    //继承的时候，子类的构造默认先调度父类的无参构造
    //框架实例化 用户   框架用的
    public UserInfo(){}

    public UserInfo(Integer uid, String uname, Address address) {
        this.uid = uid;
        this.uname = uname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", address=" + address +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
