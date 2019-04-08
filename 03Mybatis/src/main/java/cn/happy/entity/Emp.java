package cn.happy.entity;

/**
 * @Classname Emp
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/8 9:08
 * @Created by Happy-微冷的雨
 */
//在部门和员工中，员工EMp属于多的一方。我们如果希望在检索员工的同时能检索出部门名称，可以在
    //多的一方，植入一的一方的一个对象就是植入一个Dept对象
public class Emp {
    private Integer empno;
    private String empname;
    private Integer deptno;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}
