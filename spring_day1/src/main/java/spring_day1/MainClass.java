package spring_day1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("anything.xml");
		Person person = (Person)beanFactory.getBean("person"); 
		Marker marker = (Marker)beanFactory.getBean("marker");
		person.action();
		marker.mark();
	}
}
