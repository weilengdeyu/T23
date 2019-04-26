package cn.springmvc.day09autowire;

import java.util.List;

/**
 * @Classname UserInfo
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/26 11:07
 * @Created by Happy-微冷的雨
 */
public class UserInfo {
    private String uname;
    private String upwd;
    private Address address;
    private List<Address> listAdresses;

    public List<Address> getListAdresses() {
        return listAdresses;
    }

    public void setListAdresses(List<Address> listAdresses) {
        this.listAdresses = listAdresses;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
}
