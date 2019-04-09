package cn.happy.dao;

import cn.happy.entity.Student;
import cn.happy.entity.viewmodel.StudentCondition;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Classname IStudentDAO
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/2 12:05
 * @Created by Happy-微冷的雨
 */
public interface IStudentDAO {
    public List<Student> findAll() throws IOException;
    //02.根据主键查询单个对象
    public Student findById(Integer id) throws IOException;
    //03.添加学生
    public int addStudent(Student student);
    //04.修改学生
    public int updateStudent(Student student);
    //05.删除学生
    public int deleteStudent(Integer sid);
    //06.添加成功后，返回主键值。
    public int addStudentAndReturnMaxValue(Student stu);
    //07.模糊查询
    public List<Student> likeSelect(@Param("ssname") String sname,@Param("ssaddress") String address);
    //08.多条件查询，视图model方式
    public List<Student> selectByCondition(StudentCondition condition);
    //09.多条件查询，map方式
    public List<Student> selectByMap(Map<String,Object> map);
    //10.智能标签if+where 通过学生姓名查询学生信息
    public List<Student> ifTag(Student stu);
    //11.智能标签choose+where 通过学生姓名查询学生信息
    public List<Student> chooseTag(Student stu);
    //12.智能标签forEach 通过学生编号数组  查询学生信息
    public List<Student> forEachTag(int[] ids);
    //12.智能标签forEach 通过学生编号List Integer  查询学生信息
    public List<Student> forEachTagList(List<Integer> list);
    //12.智能标签forEach 通过学生编号List Student  查询学生信息
    public List<Student> forEachTagListStudent(List<Student> list);




    //根据入参的tid获取所有的学生集合
    public List<Student> findAllStudentsByTid(int tid) throws  Exception;
}
