package springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass extends Instagram{

	public static void main(String[] args) {
		
//		Instagram instagram = new Instagram();
//		instagram.reels();
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Instagram instagram = applicationContext.getBean(Instagram.class);
		instagram.reels();

	}

}
