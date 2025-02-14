package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Company;
import dto.Employee;

public class CompanyDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sharath");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void saveBoth(Company company) {
		List<Employee> list = company.getEmployees();
		entityTransaction.begin();
		for(Employee employee : list) {
			entityManager.persist(employee);
		}
		entityManager.persist(company);
		entityTransaction.commit();
	}
	
	public void fetchById(int companyId) {
		Company company = entityManager.find(Company.class, companyId);
		System.out.println(company);
	}
	
	public void deleteBoth(int companyId) {
		Company company = entityManager.find(Company.class, companyId);
		List<Employee> list = company.getEmployees();
		entityTransaction.begin();
		for(Employee employee : list) {
			entityManager.remove(employee);
		}
		entityManager.remove(company);
		entityTransaction.commit();
	}
	
	public void updateBoth(int oldCompanyId, Company newCompany) {
		newCompany.setCompanyID(oldCompanyId);
		List<Employee> newlist = newCompany.getEmployees();
		entityTransaction.begin();
		for(Employee newEmployee : newlist) {
			entityManager.merge(newEmployee);
		}
		entityManager.merge(newCompany);
		entityTransaction.commit();
	}
	
}
