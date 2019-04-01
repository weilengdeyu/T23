package cn.happy;

import java.util.*;

/**
 * 需求：定义一个双列集合
 * Key:String
 * Value:对象类型
 * 目标：通过5种方式遍历输出内容
 */
public class Day01Collection
{
    public static void main( String[] args )
    {
            //01。定义一个双列集合
        //什么是接口？他和抽象类有什么区别
        //接口中不能有实现的方法，抽象类中可以有
        //双方都不能实例化
        //凭什么我自己不能new自己
        //抽象类有构造函数？？为什么不能new？？？关联到继承，抽象类比较可悲，他自己本身有构造，但是构造
        //是为子类服务的，自身不能使用。按常理来说，一个类只要有构造，而且构造非私有，可以new自己。抽象类
        //不符合条件，接口中没有构造。接口中所有成员都是静态的。公有的并且是抽象的 public abstract
        /**
         * 金牌结论：无论接口还是抽象类，他们的终极目标都是为了实现高度抽象，另外一层含义就是抽象类和接口
         * 存在的价值就是为了让子类或者实现类重写的。那么话说回来，你让别人重写，至少非私有才行。
         * public void test(Runnable info):框架底层都是这么用的
         *  public Thread(Runnable target)
         *
         *  接口优点：多继承
         *  抽象类优点：抽象类可以做默认实现
         *  我们让一个普通类变成Servlet
         *  implements Servlet  5个方法
         *  extends  GenericServlet service
         *  extends  HttpServlet  doXXXX doPost()  doGet()
         *
         *
         *  Object
         *  什么是哈希 Hash 思考题
         */
        Map<String,UserInfo> map=new HashMap<String,UserInfo>();
        UserInfo u1=new UserInfo(18,"张靓颖");
        UserInfo u2=new UserInfo(28,"杨幂");
        map.put(u1.getName(),u1);
        map.put(u2.getName(),u2);
        //方式一：for 只拿key
        //我的思路，key的集合
        for (String key:map.keySet()){
            System.out.println(key);
        }
        //方式二：for 只拿value
        //接口与接口  继承  1个接口有N个父接口
        //类与类之间  继承  1个类只能有一个直接父类
        //类与接口之间 实现 1个类可以实现多个接口
        Collection<UserInfo> values = map.values();
        for (UserInfo item:values){
            //一个item就是一个用户对象
            System.out.println(item);
        }
        //方式三：for key+value的组合  entry=key+value
        Set<Map.Entry<String, UserInfo>> entrySet = map.entrySet();

        for (Map.Entry<String, UserInfo> item:entrySet){
            //一个item=key+value
            System.out.println(item.getKey()+"\t"+item.getValue());
        }

        //while 和 for循环的区别
        //字面上的for对固定循环次数的业务做迭代，while 循环不确定的场景
        //while和for 哪个简单》》》》》》3条件固定
        //数据库
        //方式四：while  只拿key
        //迭代器：：：：：：：：
        //迭代器都是单列集合的

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){  //true:有下一个元素需要被迭代
            String key = iterator.next();
            System.out.println(key);
        }
        System.out.println("==========华丽的分割线=============");
        //方式五：while  key+value
        Iterator<Map.Entry<String, UserInfo>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, UserInfo> entry = iterator1.next();
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

    }
}
