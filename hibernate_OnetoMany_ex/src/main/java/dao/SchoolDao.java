package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.School;
import dto.Student;

public class SchoolDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sharath");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public void saveBoth(School school) {
		List<Student> list = school.getStudents();
		entityTransaction.begin();
		for(Student student : list) {
			entityManager.persist(student);
		}
		entityManager.persist(school);
		entityTransaction.commit();
	}
	
	public void fetchById(int schoolId) {
		School school = entityManager.find(School.class, schoolId);
		System.out.println(school);
	}
	
	public void deleteBoth(int schoolId) {
		School school = entityManager.find(School.class, schoolId);
		List<Student> list = school.getStudents();
		entityTransaction.begin();
		for(Student student : list) {
			entityManager.remove(student);
		}
		entityManager.remove(school);
		entityTransaction.commit();
	}
	
	public void updateBoth(int oldSchoolId, School newSchool) {
		newSchool.setSchoolid(oldSchoolId);
		List<Student> newList = newSchool.getStudents();
		entityTransaction.begin();
		for(Student student : newList) {
			entityManager.merge(newStudent);
		}
		entityManager.merge(newCompany);
		entityTransaction.commit();
	}
}
