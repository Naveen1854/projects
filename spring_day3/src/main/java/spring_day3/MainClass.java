package spring_day3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
//		conventional way or Core Java way
//		Laptop laptop = new Laptop();
//		laptop.setId(1);
//		laptop.setBrand("Dell");
//		laptop.setPrice(75000);
//		laptop.setColor("Silver");
//		
//		System.out.println(laptop.getId());
//		System.out.println(laptop.getBrand());
//		System.out.println(laptop.getPrice());
//		System.out.println(laptop.getColor());
		
//		Spring Dependency Injection
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("laptop.xml");
		Laptop laptop2 = (Laptop) beanFactory.getBean("lap");
		System.out.println(laptop2.getId());
		System.out.println(laptop2.getBrand());
		System.out.println(laptop2.getPrice());
		System.out.println(laptop2.getColor());
		
	}
}
