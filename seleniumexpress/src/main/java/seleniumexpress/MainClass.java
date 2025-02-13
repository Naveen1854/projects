package seleniumexpress;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("service.xml");
		Airtel airtel = context.getBean(Airtel.class);
		airtel.activateService();
	}
}
