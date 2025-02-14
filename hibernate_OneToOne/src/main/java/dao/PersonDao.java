package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.AadharCard;
import dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sharath");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction(); 
	
	
//	public void saveBoth(Person person) {
//		AadharCard aadharCard = person.getAadharCard();
//		entityTransaction.begin();
//		entityManager.persist(person);
//		entityManager.persist(aadharCard);
//		entityTransaction.commit();
//	}
	
//	public void fetchPersonById(int personId) {
//		Person person = entityManager.find(Person.class, personId);
//		System.out.println(person);
//	}
	
//	public void deleteBoth(int personId) {
//		Person person = entityManager.find(Person.class, personId);
//		if(person != null) {
//			AadharCard aadharCard = person.getAadharCard();
//			entityTransaction.begin();
//			entityManager.remove(person);
//			entityManager.remove(aadharCard);
//			entityTransaction.commit();
//		}else {
//			System.out.println("PersonId not Present in db");
//		}
//	}
	
	public void updateBoth(int oldPersonId, Person newPerson) {
		newPerson.setPersonId(oldPersonId);
		AadharCard newAadharCard = newPerson.getAadharCard();
		entityTransaction.begin();
		entityManager.merge(newPerson);
		entityManager.merge(newAadharCard);
		entityTransaction.commit();		
	}
	
}
