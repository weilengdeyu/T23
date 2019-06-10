package filter;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtils;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @Classname ${NAME}
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/10 10:42
 * @Created by Happy-微冷的雨
 */
public class OpenSessionInViewFilter implements javax.servlet.Filter {
    public void destroy() {
    }
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        // 请求到达时，打开Session并启动事务
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.currentSession();
            System.out.println("filter\t"+session.hashCode());
            tx = session.beginTransaction();
            // 执行请求处理链
            chain.doFilter(request, response);
            // 返回响应时，提交事务
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            // 关闭session
            HibernateUtils.closeSession();
        }
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {

    }

}
