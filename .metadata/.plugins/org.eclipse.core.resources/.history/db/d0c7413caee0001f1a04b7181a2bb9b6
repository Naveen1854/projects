package spring_day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		Bike bike = new Bike();
//		bike.brand();
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
//		Bike bike = (Bike) applicationContext.getBean("bike");
		
		Bike bike = applicationContext.getBean(Bike.class);
		bike.brand();
	}
}
