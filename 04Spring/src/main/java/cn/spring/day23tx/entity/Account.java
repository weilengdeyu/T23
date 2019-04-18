package cn.spring.day23tx.entity;

public class Account {
    //账户编号
    // 6226620204949861  原玉明
    private Integer aid;

    //持卡人
    private String aname;
    //卡上的余额
    private double abalance;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public double getAbalance() {
        return abalance;
    }

    public void setAbalance(double abalance) {
        this.abalance = abalance;
    }
}