package spring_day6;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		Husband husband = new Husband();
//		husband.setHusbandId(1);
//		husband.setHusbandName("Allu Arjun");
//		husband.setHusbandAge(45);
//		husband.setHusbandSalary(1200000);
		
//		System.out.println(husband.getHusbandId());
//		System.out.println(husband.getHusbandName());
//		System.out.println(husband.getHusbandAge());
//		System.out.println(husband.getHusbandSalary());
//		System.out.println("------------------------");
		
//		Wife wife = new Wife();
//		wife.setWifeId(1);
//		wife.setWifeName("Sneha Reddy");
//		wife.setWifeAge(43);
//		wife.setWifeSalary(1000000);
		
//		husband.setWife(wife);
		
//		System.out.println(wife.getWifeId());
//		System.out.println(wife.getWifeName());
//		System.out.println(wife.getWifeAge());
//		System.out.println(wife.getWifeSalary());

		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("husband.xml");
		Husband husband = beanFactory.getBean(Husband.class);
		System.out.println(husband.getHusbandId());
		System.out.println(husband.getHusbandName());
		System.out.println(husband.getHusbandAge());
		System.out.println(husband.getHusbandSalary());
		
		System.out.println("------------------------");
		
		System.out.println(husband.getWife().getWifeId());
		System.out.println(husband.getWife().getWifeName());
		System.out.println(husband.getWife().getWifeAge());
		System.out.println(husband.getWife().getWifeSalary());
	}

}
