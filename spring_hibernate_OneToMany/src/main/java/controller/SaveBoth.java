package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.CompanyDao;
import dto.Company;
import dto.Employee;

public class SaveBoth {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Company company = applicationContext.getBean(Company.class);
		company.setCompanyName("IBM");
		company.setCompanyAddress("Hyd");
		company.setCompanyEmail("ibm@123");
		company.setCompanyPhone(8522991195l);
		
		Employee employee1 = applicationContext.getBean(Employee.class);
		employee1.setEmployeeName("Ganesh");
		employee1.setEmployeePhone(2345678);
		employee1.setEmployeeRole("FSD");
		employee1.setEmployeeSal(80000.0);
		
		Employee employee2 = applicationContext.getBean(Employee.class);
		employee2.setEmployeeName("Charan");
		employee2.setEmployeePhone(9876543);
		employee2.setEmployeeRole("BED");
		employee2.setEmployeeSal(90000.0);
		
		Employee employee3 = applicationContext.getBean(Employee.class);
		employee3.setEmployeeName("Abhi");
		employee3.setEmployeePhone(923453);
		employee3.setEmployeeRole("FED");
		employee3.setEmployeeSal(40000.0);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		company.setEmployee(list);
		
		CompanyDao companyDao = applicationContext.getBean(CompanyDao.class);
		companyDao.saveBoth(company);
	}

}
