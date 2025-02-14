package controller;

import dao.PassengerDao;

public class FetchBoth {

	public static void main(String[] args) {
		
		PassengerDao passengerDao = new PassengerDao();
		passengerDao.fetchBoth(1);

	}

}
