package cn.spring.day22jdbctemplate.test;

/**
 * @Classname BookInfo
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 9:57
 * @Created by Happy-微冷的雨
 */
public class BookInfo {
    private String bookname;
    private Integer bookprice;

    public Integer getBookprice() {
        return bookprice;
    }

    public void setBookprice(Integer bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
}
