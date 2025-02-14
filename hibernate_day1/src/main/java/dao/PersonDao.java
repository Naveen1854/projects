package dao;

import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityManagerFactory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dto.Person;

public class PersonDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("sharath");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void savePerson(Person p) {
		et.begin();
		em.persist(p);
		et.commit();
	}
	
	public void fetchPersonId(int id) {
		Person p = em.find(Person.class, id);
		System.out.println(p);
	}
	
	public void deletePersonById(int id) {
		Person p = em.find(Person.class, id);
		et.begin();
		em.remove(p);
		et.commit();
	}
	
	public void updatePersonById(int oldId, Person newPerson) {
		newPerson.setPersonId(oldId);
		et.begin();
		em.merge(newPerson);
		et.commit();
	}
	
	public void fetchAll() {
		Query query = em.createQuery("select q from Person q");
		List<Person> list = query.getResultList();
		System.out.println(list);
	}
	
	public void fetchPersonByName(String name) {
		Query query = em.createQuery("select ref from Person ref where PersonName=?1");
		query.setParameter(1, name);
		List<Person> list = query.getResultList();
		System.out.println(list);
	}
	
	public void fetchPersonByAddress(String address) {
		Query query = em.createQuery("select a from Person a where PersonAddress = ?1");
		query.setParameter(1, address);
		List<Person> list = query.getResultList();
		System.out.println(list);
	}
	
}
