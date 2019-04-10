package cn.spring.day01.entity;

/**
 * @Classname Car
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/10 11:48
 * @Created by Happy-微冷的雨
 */
//lombok 研究 坐标     idea集成lombok插件
public class Car {
    private String brand;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
