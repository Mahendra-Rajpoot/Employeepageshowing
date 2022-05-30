package com.jbk.dao;

import javax.websocket.Session;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sf;
	@Override
	public Employee loginPage(Employee employee) {
		org.hibernate.Session session=sf.openSession();
		Employee emp=null;
		try {
			
			Criteria criteria=session.createCriteria(Employee.class);
			        Criterion username = Restrictions.eq("username", employee.getUsername());  
			        Criterion password=Restrictions.eq("password", employee.getPassword());
			         criteria.add(Restrictions.and(username,password));
			        emp= (Employee) criteria.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return emp;
	}

}
