package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import dto.Car;
import dto.Engine;

@Component
public class CarDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sharath");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveBoth(Car car) {
		Engine engine = car.getEngine();
		entityTransaction.begin();
		entityManager.persist(car);
		entityManager.persist(engine);
		entityTransaction.commit();
	}
}
