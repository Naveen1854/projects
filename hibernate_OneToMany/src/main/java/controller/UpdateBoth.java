package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CompanyDao;
import dto.Company;
import dto.Employee;

public class UpdateBoth {

	public static void main(String[] args) {
		Company newCompany = new Company();
		newCompany.setCompanyName("TCS");
		newCompany.setCompanyAddress("brl");
		newCompany.setCompanyEmail("tcs@123");
		newCompany.setCompanyPhone(987654);
		
		Employee newemployee1 = new Employee();
		newemployee1.setEmployeeName("bhai");
		newemployee1.setEmployeePhone(2345678);
		newemployee1.setEmployeeRole("hero");
		newemployee1.setEmployeeSal(80000.0);
		
		Employee newemployee2 = new Employee();
		newemployee2.setEmployeeName("ramcharan");
		newemployee2.setEmployeePhone(9876543);
		newemployee2.setEmployeeRole("BED");
		newemployee2.setEmployeeSal(90000.0);
		
		Employee newemployee3 = new Employee();
		newemployee3.setEmployeeName("prabhas");
		newemployee3.setEmployeePhone(923453);
		newemployee3.setEmployeeRole("FED");
		newemployee3.setEmployeeSal(40000.0);
		
		List<Employee> newlist = new ArrayList<Employee>();
		newlist.add(newemployee1);
		newlist.add(newemployee2);
		newlist.add(newemployee3);
		
		newCompany.setEmployees(newlist);
		
		CompanyDao companyDao = new CompanyDao();
		companyDao.updateBoth(2, newCompany);

	}

}
