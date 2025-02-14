package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sharath");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entTransaction = entityManager.getTransaction();
}
