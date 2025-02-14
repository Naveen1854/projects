package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CompanyDao;
import dto.Company;
import dto.Employee;

public class SaveBoth {

	public static void main(String[] args) {
		
		Company company = new Company();
		company.setCompanyName("IBM");
		company.setCompanyAddress("Hyd");
		company.setCompanyEmail("ibm@123");
		company.setCompanyPhone(8522991195l);
		
		Employee employee1 = new Employee();
		employee1.setEmployeeName("Ganesh");
		employee1.setEmployeePhone(2345678);
		employee1.setEmployeeRole("FSD");
		employee1.setEmployeeSal(80000.0);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeName("Charan");
		employee2.setEmployeePhone(9876543);
		employee2.setEmployeeRole("BED");
		employee2.setEmployeeSal(90000.0);
		
		Employee employee3 = new Employee();
		employee3.setEmployeeName("Abhi");
		employee3.setEmployeePhone(923453);
		employee3.setEmployeeRole("FED");
		employee3.setEmployeeSal(40000.0);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		company.setEmployees(list);
		
		CompanyDao companyDao = new CompanyDao();
		companyDao.saveBoth(company);

	}

}
