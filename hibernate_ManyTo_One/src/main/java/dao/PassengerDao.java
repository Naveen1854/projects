package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Bus;
import dto.Passenger;

public class PassengerDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sharath");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void saveBoth(Passenger passenger) {
		Bus bus = passenger.getBus();
		entityTransaction.begin();
		entityManager.persist(bus);
		entityManager.persist(passenger);
		entityTransaction.commit();
	}
	
	public void fetchBoth(int passengeId) {
		Passenger passenger = entityManager.find(Passenger.class, passengeId);
		System.out.println(passenger);
	}
	
	public void deleteBoth(int passengerId) {
		
	}
}
