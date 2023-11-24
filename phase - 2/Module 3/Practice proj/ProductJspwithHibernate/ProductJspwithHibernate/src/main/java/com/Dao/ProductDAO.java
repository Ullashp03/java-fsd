package com.Dao;

import java.util.List;

import javax.transaction.Transaction;

import com.dbutil.DbUtil;
import com.jsp.pojo.Product;
import org.hibernate.Session;

import org.hibernate.query.Query;



public class ProductDAO {

	public int addproduct(Product product) {
		Session session=DbUtil.dbConn();
		org.hibernate.Transaction trans=session.beginTransaction();
		int value=(Integer) session.save(product);
		trans.commit();
		session.close();
		return value;
		
	}
	
	public List<Product> display(){
		Session session=DbUtil.dbConn();
		org.hibernate.Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Product");
		List<Product> list=query.list();
		trans.commit();
		session.close();
		return list;
	}
	
	public List<Product> delete(Product product){
		Session session=DbUtil.dbConn();
		org.hibernate.Transaction trans=session.beginTransaction();
		session.delete(product);
		trans.commit();
		session.close();
		return display();
	}
	
	
}
