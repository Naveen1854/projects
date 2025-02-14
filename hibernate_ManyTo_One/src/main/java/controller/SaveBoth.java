package controller;

import dao.PassengerDao;
import dto.Bus;
import dto.Passenger;

public class SaveBoth {

	public static void main(String[] args) {
		
		Passenger passenger1 = new Passenger();
		passenger1.setPassengerName("Naveen");
		passenger1.setPassengerAddress("HYD");
		passenger1.setPassengerPhone(8765476);
		passenger1.setPassegerGender("Male");
		
		Passenger passenger2 = new Passenger();
		passenger2.setPassengerName("kiran");
		passenger2.setPassengerAddress("Delhi");
		passenger2.setPassengerPhone(3456654);
		passenger2.setPassegerGender("Male");
		
		Passenger passenger3 = new Passenger();
		passenger3.setPassengerName("Akshay");
		passenger3.setPassengerAddress("Mumbai");
		passenger3.setPassengerPhone(8765467);
		passenger3.setPassegerGender("Male");
		
		Bus bus = new Bus();
		bus.setBusColor("red");
		bus.setBusNumber(234345);
		bus.setBusType("AC");
		
		passenger1.setBus(bus);
		passenger2.setBus(bus);
		passenger3.setBus(bus);
		
		PassengerDao passengerDao = new PassengerDao();
		passengerDao.saveBoth(passenger1);
		passengerDao.saveBoth(passenger2);
		passengerDao.saveBoth(passenger3);
	}

}
