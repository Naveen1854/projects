package controller;

import java.util.ArrayList;
import java.util.List;

import dto.School;

public class UpdateBoth {

	public static void main(String[] args) {
		School newSchool = new School();
		newSchool.setSchoolName("HPS");
		newSchool.setSchoolEmail("hps@123");
		newSchool.setSchoolAddress("HYD");
		newSchool.setSchoolPhone(198765);
		
		Student newStudent1 = new Student();
		newStudent1.setStudentName("bhai");
		newStudent1.setStudentPhone(2345678);
		newStudent1.setStudentRole("hero");
		newStudent1.setStudentSal(80000.0);
//		
//		Employee newemployee2 = new Employee();
//		newemployee2.setEmployeeName("ramcharan");
//		newemployee2.setEmployeePhone(9876543);
//		newemployee2.setEmployeeRole("BED");
//		newemployee2.setEmployeeSal(90000.0);
//		
//		Employee newemployee3 = new Employee();
//		newemployee3.setEmployeeName("prabhas");
//		newemployee3.setEmployeePhone(923453);
//		newemployee3.setEmployeeRole("FED");
//		newemployee3.setEmployeeSal(40000.0);
//		
//		List<Employee> newlist = new ArrayList<Employee>();
//		newlist.add(newemployee1);
//		newlist.add(newemployee2);
//		newlist.add(newemployee3);
//		
//		newCompany.setEmployees(newlist);
//		
//		CompanyDao companyDao = new CompanyDao();
//		companyDao.updateBoth(2, newCompany);

	}

	}

}
