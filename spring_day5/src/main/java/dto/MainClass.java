package dto;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
//		Restaurant restaurant = new Restaurant();
//		restaurant.name();
//		
//		Branch branch = new Branch();
//		branch.location();
//		
//		Manager manager =new Manager();
//		manager.sal();
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("restaurant.xml");
		Restaurant restaurant = (Restaurant) beanFactory.getBean("restaurant");
		Manager manager = (Manager) beanFactory.getBean("manager");
		restaurant.name();
		manager.sal();
	}

}
