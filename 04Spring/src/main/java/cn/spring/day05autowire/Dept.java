package cn.spring.day05autowire;

/**
 * @Classname Dept
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/11 11:12
 * @Created by Happy-微冷的雨
 */
public class Dept {
    private Integer deptno;
    private String deptname;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
