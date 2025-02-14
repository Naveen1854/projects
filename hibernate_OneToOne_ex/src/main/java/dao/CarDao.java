package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Car;
import dto.Engine;

public class CarDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sharath");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction(); 
	
//	public void saveBoth(Car car) {
//		Engine engine = car.getEngine();
//		entityTransaction.begin();
//		entityManager.persist(car);
//		entityManager.persist(engine);
//		entityTransaction.commit();
//	}
	
//	public void fetchCarById(int carId) {
//		Car car = entityManager.find(Car.class, carId);
//		System.out.println(car);
//	}
	
	public void deleteBoth(int carId) {
		Car car = entityManager.find(Car.class, carId);
		if(car != null) {
			Engine engine = car.getEngine();
			entityTransaction.begin();
			entityManager.remove(car);
			entityManager.remove(engine);
			entityTransaction.commit();
		}else {
			System.out.println("CarId not present in db");
		}
	}
		
}
