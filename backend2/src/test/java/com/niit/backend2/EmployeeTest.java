/*package com.niit.backend2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Dao.EmployeeDao;
import com.niit.model.Employee;



public class EmployeeTest {
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext();
		config.scan("com.niit.*");
		config.refresh();
		Employee employee=(Employee)config.getBean("employee");
		
		EmployeeDao employeeDao=(EmployeeDao)config.getBean("employeeDao");
		
	employee.setEid("101");
	employee.setEname("james");
	employee.setDepartment("ece");
	employee.setSalary("399500");
	employee.setDob(11/02/1995);
	
  
	employeeDao.insertEmployee(employee);
		
}
		

}
*/