package seleniumexpressautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
	public static void main(String[] args) {
		ApplicationContext contect = new ClassPathXmlApplicationContext("beans.xml");
		Human human = contect.getBean("human", Human.class);
		human.startPumping();
	}
}
