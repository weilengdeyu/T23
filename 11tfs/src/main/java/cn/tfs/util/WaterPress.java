package cn.tfs.util;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.OutputStream;
import java.util.List;

/**
 * @Classname WaterPress
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/8 14:58
 * @Created by Happy-微冷的雨
 */
public class WaterPress {
    private static List logoImgs;

    private static List bgImgs;

    private static boolean flag;

    public static List getBgImgs() {
        return bgImgs;
    }

    /**
     * 把图片印刷到图片上
     *
     * @param pressImg  --
     *                  水印文件
     * @param targetImg --
     *                  目标文件
     * @param x         --x坐标
     * @param y         --y坐标
     * @param out       输出流(可以来自HttpServletReponse的输出)
     */
    public final static void pressImage(String pressImg, String targetImg,
                                        int x, int y, OutputStream out) {
        try {
          // 目标文件
            File _file = new File(targetImg);
            Image src = ImageIO.read(_file);
            int wideth = src.getWidth(null);
            int height = src.getHeight(null);
            BufferedImage image = new BufferedImage(wideth, height,
                    BufferedImage.TYPE_INT_RGB);
            Graphics g = image.createGraphics();
            g.drawImage(src, 0, 0, wideth, height, null);

// 水印文件
            File _filebiao = new File(pressImg);
            Image src_biao = ImageIO.read(_filebiao);
            int wideth_biao = src_biao.getWidth(null);
            int height_biao = src_biao.getHeight(null);
            g.drawImage(src_biao, (wideth - wideth_biao) / 2,
                    (height - height_biao) / 2, wideth_biao, height_biao, null);
// 水印文件结束
            g.dispose();

            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            encoder.encode(image);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印文字水印图片
     *
     * @param pressText --文字
     * @param targetImg --
     *                  目标图片
     * @param fontName  --
     *                  字体名
     * @param fontStyle --
     *                  字体样式
     * @param color     --
     *                  字体颜色
     * @param fontSize  --
     *                  字体大小
     * @param x         --
     *                  偏移量(从右下角算起)
     * @param y         --
     *                  偏移量(从右下角算起)
     * @param out       输出流(可以来自HttpServletReponse的输出)
     */

    public static void pressText(String pressText, String targetImg,
                                 String fontName, int fontStyle, int color, int fontSize, int x,
                                 int y, OutputStream out,Integer degree, Color color2) {
        try {
            File _file = new File(targetImg);
            Image srcImg = ImageIO.read(_file);
            int wideth = srcImg.getWidth(null);
            int height = srcImg.getHeight(null);
            //只有图片的宽或高大于200的时候才添加水印（小图片不添加）
            if (wideth > 200 || height > 200) {
                BufferedImage buffImg = new BufferedImage(wideth, height,
                        BufferedImage.TYPE_INT_RGB);
                // 2、得到画笔对象
                Graphics2D g = buffImg.createGraphics();
                // 3、设置对线段的锯齿状边缘处理
                g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g.drawImage(srcImg.getScaledInstance(srcImg.getWidth(null), srcImg.getHeight(null), java.awt.Image.SCALE_SMOOTH), 0, 0, null);
                // 4、设置水印旋转
                if (null != degree) {
                    g.rotate(Math.toRadians(degree),  buffImg.getWidth()/2,buffImg.getHeight() /2);
                }
                // 5、设置水印文字颜色
                g.setColor(color2);
                // 6、设置水印文字Font
                g.setFont(new java.awt.Font("宋体", java.awt.Font.BOLD, buffImg.getHeight() /10));
                // 7、设置水印文字透明度
                g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 1.0f));
                // 8、第一参数->设置的内容，后面两个参数->文字在图片上的坐标位置(x,y)
                g.drawString(pressText,  buffImg.getWidth()/10 , buffImg.getHeight()/2);
                // 9、释放资源
                g.dispose();
                /*Graphics g = image.createGraphics();

                g.drawImage(src, 0, 0, wideth, height, null);
                g.setColor(new Color(color));
                g.setFont(new Font(fontName, fontStyle, fontSize));
                g.drawString(pressText, wideth - fontSize - x, height
                        - fontSize / 2 - y);
                g.dispose();*/
                JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
                encoder.encode(buffImg);
                out.close();
                System.out.println("end=========================");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

