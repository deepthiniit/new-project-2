package com.niit.DaoImpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.EmployeeDao;
import com.niit.model.Employee;


@Transactional
@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao  {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	@Transactional
	public void insertEmployee(Employee employee) {
		Session session=sessionFactory.getCurrentSession();
		session.save(employee);
	}

}
