package cn.spring.day02printer;

/**
 * @Classname Printer
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/10 12:02
 * @Created by Happy-微冷的雨
 */

/**
 * 打印机类
 */
public class Printer {
    //组合墨盒
    private Ink ink;
    //组合纸张
    private Paper paper;
    //打印机有个打印按键
    public void print(){
        System.out.println("Epson品牌的打印机正在使用"+ink.getColor()+"墨盒\t"+paper.getSize()+"上打印我爱你==中国");
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}
