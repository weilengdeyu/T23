package cn.spring.day07annotationdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Classname Publisher
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/12 10:48
 * @Created by Happy-微冷的雨
 */
@Component("xxxx")
public class Publisher {
    @Value("北大出版社")
    private String pubname;

    public String getPubname() {
        return pubname;
    }

    public void setPubname(String pubname) {
        this.pubname = pubname;
    }
}
