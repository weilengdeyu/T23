package service;

import dao.HibernateDao;
import org.hibernate.Transaction;
import util.HibernateUtils;

import java.io.Serializable;

public class HibernateBiz {

    HibernateDao dao=new HibernateDao();

	public Object get(Class clazz,Serializable id){
		    //Transaction tx = HibernateUtils.currentSession().beginTransaction();
		    Object obj= dao.get(clazz, id);
			System.out.println("==============================================");
		    //tx.commit();
		    //HibernateUtils.closeSession();
		    return obj;
	}
}