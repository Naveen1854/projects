package springio;
import org.springframework.context.ApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	}
}
