package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.User;

public class UserDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sharath");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}
	
	
	public boolean deleteUserById(int id) {
		User user = entityManager.find(User.class, id);
		if(user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}else {
			return false;
		}
	}
	
	public User fetchUserByEmail(String email) {
		Query query = entityManager.createQuery("select u from User u where userEmail=?1");
		query.setParameter(1, email);
		User user = (User) query.getSingleResult();
		return user;
	}
	
	public List<User> fetchAll() {
		Query query = entityManager.createQuery("select u from User u");
		List<User> user = query.getResultList();
		return user;
	}
	
	public User fetchById(int id){
		User user = entityManager.find(User.class, id);
		return user;
	}
	
	public User updateUser(User newUser) {
		entityTransaction.begin();
		entityManager.merge(newUser);
		entityTransaction.commit();
		return newUser;
	}

}
