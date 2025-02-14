package dao;

public class UserDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sharath");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

//	static void saveUser() {
//	entityTransaction.begin();
//	entityManager.persist(user);
//	entityTransaction.commit();
//	}
}
