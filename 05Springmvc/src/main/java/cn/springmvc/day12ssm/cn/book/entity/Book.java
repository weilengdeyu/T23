package cn.springmvc.day12ssm.cn.book.entity;/**
 * Created by Happy on 2018-12-18.
 */

/**
 * 作者：微冷的雨
 * @create 2018-12-18
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Book {
    //图书编号
    private Integer bookid;
    //图书名称
    private String  bookname;
    //图书价格
    private double bookprice;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public double getBookprice() {
        return bookprice;
    }

    public void setBookprice(double bookprice) {
        this.bookprice = bookprice;
    }
}
