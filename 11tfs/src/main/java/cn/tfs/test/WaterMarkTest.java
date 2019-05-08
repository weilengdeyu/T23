package cn.tfs.test;

import cn.tfs.util.WaterMarkTool;

import java.awt.*;

/**
 * @Classname WaterMarkTest
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/8 14:24
 * @Created by Happy-微冷的雨
 */
public class WaterMarkTest {
    public static void main(String[] args) {
        WaterMarkTool.markImageByText("五道口学院","d:/王世超offer.jpg",
                "d:/马立强2.jpg",30,new Color(238, 39, 29),"png");
        System.out.println("水印添加完成");
    }
}
