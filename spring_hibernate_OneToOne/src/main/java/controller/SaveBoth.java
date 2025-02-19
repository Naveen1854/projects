package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.CarDao;
import dto.Car;
import dto.Engine;

public class SaveBoth {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConifurationClass.class);
		Car car =  (Car) applicationContext.getBean("car");
		car.setCarName("KIA");
		car.setCarColor("purple white");
		car.setPrice(1500000);
		
		Engine engine = (Engine) applicationContext.getBean("engine");
		engine.setType("petrol");
		engine.setModel("k1");
		engine.setEngineCc(1200);
		car.setEngine(engine);
		
		CarDao carDao = (CarDao) applicationContext.getBean("carDao");
		carDao.saveBoth(car);
	}

}
