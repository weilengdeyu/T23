package cn.happy.entity;

import java.util.List;

/**
 * @Classname Category
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/8 11:19
 * @Created by Happy-微冷的雨
 */
public class Category {
    private Integer cid;
    private String cname;
    private Integer pid;
    //1：N  一个分类下有维护这一个分类集合
    private List<Category> cates;


    @Override
    public String toString() {
        return "Category{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", pid=" + pid +
                ", cates=" + cates +
                '}';
    }

    public List<Category> getCates() {
        return cates;
    }

    public void setCates(List<Category> cates) {
        this.cates = cates;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
