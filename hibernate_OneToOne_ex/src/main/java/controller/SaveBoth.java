package controller;

import dao.CarDao;
import dto.Car;
import dto.Engine;

public class SaveBoth {

	public static void main(String[] args) {
		Car car = new Car();
//		car.setCarId(1);
		car.setCarName("KIA");
		car.setCarColor("purple white");
		car.setPrice(1500000);

		Engine engine = new Engine();
//		engine.setEngineId(6);
		engine.setType("petrol");
		engine.setModel("k1");
		engine.setEngineCc(1200);
		
		car.setEngine(engine);
		
		CarDao carDao = new CarDao();
//		carDao.saveBoth(car);
	}

}
