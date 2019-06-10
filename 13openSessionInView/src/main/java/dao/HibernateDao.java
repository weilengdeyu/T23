package dao;

import util.HibernateUtils;

import java.io.Serializable;

public class HibernateDao {
    /**
     * 1.1 get
     * 
     */
    public Object get(Class clazz,Serializable id){
		   System.out.println("dao\t"+ HibernateUtils.currentSession());
		   Object result= HibernateUtils.currentSession().load(clazz, id);
	       return result;
	}
}