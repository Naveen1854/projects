package spring_day4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		Chocolate chocolate = new Chocolate(1, "fivestar", "cadbury", "choco", 185);
		System.out.println(chocolate);
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chocolate.xml");
		Chocolate chocolate1 = (Chocolate) beanFactory.getBean("chocolate");
		System.out.println(chocolate1);
	}
}
