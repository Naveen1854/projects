package spring_day7;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		Pushpa2 pushpa2 = new  Pushpa2();
//		pushpa2.name();
//		
//		Salar salar = new Salar();
//		salar.name();

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("movie.xml");
		
//		Pushpa2 pushpa2 = beanFactory.getBean(Pushpa2.class);
//		pushpa2.name();
		
//		Salar salar = beanFactory.getBean(Salar.class);
//		salar.name();
		
		BoxOffice boxOffice = beanFactory.getBean(BoxOffice.class);
		boxOffice.collection();
	}

}
