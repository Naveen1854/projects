package dependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("mobile.xml");
		Instagram instagram = (Instagram) beanFactory.getBean("insta");
		instagram.open();

	}

}
