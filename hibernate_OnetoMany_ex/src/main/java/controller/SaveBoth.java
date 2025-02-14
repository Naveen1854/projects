package controller;

import java.util.ArrayList;
import java.util.List;

import dao.SchoolDao;
import dto.School;
import dto.Student;

public class SaveBoth {

	public static void main(String[] args) {
		School school = new School();
		school.setSchoolName("HPS");
		school.setSchoolEmail("hps@123");
		school.setSchoolAddress("HYD");
		school.setSchoolPhone(198765);
		
		Student student1 = new Student();
		student1.setStudentName("Naveen");
		student1.setStudentAge(23);
		student1.setStudentGender("Male");
		student1.setStudentAddress("Warangal");
		student1.setStudentRollno(54);
		
		Student student2 = new Student();
		student2.setStudentName("kiran");
		student2.setStudentAge(25);
		student2.setStudentGender("Male");
		student2.setStudentAddress("delhi");
		student2.setStudentRollno(19);
		
		Student student3 = new Student();
		student3.setStudentName("Akshay");
		student3.setStudentAge(22);
		student3.setStudentGender("Male");
		student3.setStudentAddress("Nspt");
		student3.setStudentRollno(10);
		
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		school.setStudents(list);
		
		SchoolDao schoolDao = new SchoolDao();
		schoolDao.saveBoth(school);
	}

}
