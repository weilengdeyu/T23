package cn.spring.day04xmldi;

/**
 * @Classname Address
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/11 10:59
 * @Created by Happy-微冷的雨
 */
public class Address {
    private String position;

    @Override
    public String toString() {
        return "Address{" +
                "position='" + position + '\'' +
                '}';
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
