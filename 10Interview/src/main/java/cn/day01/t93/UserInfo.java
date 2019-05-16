package cn.day01.t93;

import java.io.Serializable;

/**
 * @Classname UserInfo
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/16 12:13
 * @Created by Happy-微冷的雨
 */
public class UserInfo implements Serializable {
    private Integer uid;
    private String uname;


    public UserInfo(Integer uid, String uname) {
        this.uid = uid;
        this.uname = uname;
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
}
