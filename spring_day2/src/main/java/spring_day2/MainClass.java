package spring_day2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		conventional way or core java way
//		MallaReddy mallaReddy = new MallaReddy();
//		mallaReddy.location();
//		
//		Tkr tkr = new Tkr();
//		tkr.location();
//		
//		College college = new MallaReddy();
//		college.location();
//		
//		College college2 = new Tkr();
//		college2.location();
		
		
//		Spring Way
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("college.xml");
		MallaReddy mallaReddy = (MallaReddy) beanFactory.getBean("malla");
		mallaReddy.location();
		
		Tkr tkr = (Tkr) beanFactory.getBean("tkr");
		tkr.location();
	}

}
