package cn.happy.entity.viewmodel;

/**
 * @Classname StudentCondition
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/5 9:53
 * @Created by Happy-微冷的雨
 */
public class StudentCondition {
    private String sname;
    private String address;

    @Override
    public String toString() {
        return "StudentCondition{" +
                "sname='" + sname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
