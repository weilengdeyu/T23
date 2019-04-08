package cn.happy.entity;

import java.util.List;

/**
 * @Classname Dept
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/8 9:07
 * @Created by Happy-微冷的雨
 */
//一的乙方记忆多的一方
public class Dept {
    private Integer deptno;
    private String deptname;

    private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

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
