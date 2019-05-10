package cn.day01.t18;

/**
 * @Classname UserInfo
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/7 10:47
 * @Created by Happy-微冷的雨
 */
//implements Serializable 保证的是对象可以通过网络传输，从内存写到硬盘，或者反向
public class UserInfo{

    /** The value is used for character storage. */
    private final char value[]= "abc".toCharArray();

    /** Cache the hash code for the string */
    private int hash; // Default to 0

    private String uname;
    private String upwd;

    //重写过
    @Override
    public int hashCode() {
        int h = hash;
        if (h == 0 && value.length > 0) {
            char val[] = value;

            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
            hash = h;
        }
        return h;
    }


    @Override
    public boolean equals(Object obj) {
        UserInfo uu= (UserInfo)obj;
        if (this.getUname().equals(uu.getUname())){
            return true;
        }else{
            return false;
        }
    }




    public UserInfo(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
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
